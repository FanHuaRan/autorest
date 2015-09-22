/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import fixtures.bodystring.models.Colors;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in EnumOperations.
 */
public interface EnumOperations {
    /**
     * The interface defining all the services for EnumOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface EnumService {
        @GET("/string/enum/notExpandable")
        Response getNotExpandable() throws ServiceException;

        @GET("/string/enum/notExpandable")
        void getNotExpandableAsync(ServiceResponseCallback cb);

        @PUT("/string/enum/notExpandable")
        Response putNotExpandable(@Body Colors stringBody) throws ServiceException;

        @PUT("/string/enum/notExpandable")
        void putNotExpandableAsync(@Body Colors stringBody, ServiceResponseCallback cb);

    }
    /**
     * Get enum value 'red color' from enumeration of 'red color',
     * 'green-color', 'blue_color'.
     *
     * @return the Colors object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Colors getNotExpandable() throws ServiceException;

    /**
     * Get enum value 'red color' from enumeration of 'red color',
     * 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNotExpandableAsync(final ServiceCallback<Colors> serviceCallback);

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color',
     * 'blue_color'
     *
     * @param stringBody Possible values for this parameter include: 'red color', 'green-color', 'blue_color'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putNotExpandable(Colors stringBody) throws ServiceException;

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color',
     * 'blue_color'
     *
     * @param stringBody Possible values for this parameter include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void putNotExpandableAsync(Colors stringBody, final ServiceCallback<Void> serviceCallback);

}