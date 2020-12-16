package eu.nimble.utility.persistence;

import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by suat on 20-Nov-18.
 */
public interface GenericJPARepository extends TransactionAcrossMultipleDB{
    EntityManagerFactory getEmf();

    <T> T getSingleEntityByHjid(Class<T> klass, long hjid);

    <T> T getSingleEntity(String query, String[] parameterNames, Object[] parameterValues);

    <T> List<T> getEntities(String query);

    <T> List<T> getEntities(String query, String[] parameterNames, Object[] parameterValues);

    <T> List<T> getEntities(String query, String[] parameterNames, Object[] parameterValues, boolean isNative);

    <T> List<T> getEntities(String query, String[] parameterNames, Object[] parameterValues, Integer limit, Integer offset);

    <T> List<T> getEntities(String query, String[] parameterNames, Object[] parameterValues, Integer limit, Integer offset, boolean isNative);

    <T> List<T> getEntities(Class<T> klass);

    <T> T updateEntity(T entity);

    <T> void deleteEntity(T entity);

    <T> void deleteEntityByHjid(Class<T> klass, long hjid);

    <T> void persistEntity(T entity);

    <T> void persistEntities(Iterable<T> entities);
}