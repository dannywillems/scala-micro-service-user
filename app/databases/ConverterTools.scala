package services.database

import java.sql.{ResultSet, SQLException}

/**
 High level interface for database queries. See [[AdQuery]] for lower level database queries.

 TODO: raise Exception when something went wrong.
 */
object ConverterTools
{
  /**
   * Convert a result set object to an object [[A]] by using the [[toObject]]
   * function.

   * It uses the fact that [[resultSet.next()]] returns [[false]] when
   * there is no more available result.
   * This implementation is entirely functional and tail recursive.
   */
  def mapResultSet[A] (resultSet : ResultSet, toObject : (ResultSet ⇒ A)) : List[A] =
  {
    if (resultSet.next())
      toObject(resultSet) :: mapResultSet(resultSet, toObject)
    else
      List()
  }

  /**
   * Convert a single result to an objet [[A]] by using the [[toObject]] function.
   */
  def objectOfResultSet[A] (resultSet : ResultSet, toObject : (ResultSet ⇒ A)) : A =
  {
    if (resultSet.next())
      toObject(resultSet)
    else
    {
      throw new SQLException("objectOfResultSet: no result found.")
    }
  }
}
