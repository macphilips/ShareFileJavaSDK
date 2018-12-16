package com.citrix.sharefile.api.interfaces;

import com.citrix.sharefile.api.constants.SFKeywords;
import com.citrix.sharefile.api.enumerations.SFSafeEnum;
import com.citrix.sharefile.api.enumerations.SFV3ElementType;
import com.citrix.sharefile.api.exceptions.*;
import com.citrix.sharefile.api.models.SFODataObject;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public interface ISFQuery<T> {
    ISFQuery<T> setApiClient(ISFApiClient apiClient);

    ISFQuery<T> setFrom(String string);

    ISFQuery<T> addIds(URI url);

    ISFQuery<T> setAction(String string);

    ISFQuery<T> setBody(SFODataObject sfoDataObject);

    ISFQuery<T> setBody(ArrayList<?> sfoDataObjectsFeed);

    ISFQuery<T> addQueryString(String string, Object type);

    ISFQuery<T> addActionIds(String id);

    ISFQuery<T> addActionIds(Integer id);

    ISFQuery<T> addQueryString(String string, ArrayList<String> ids);

    ISFQuery<T> addSubAction(String string);

    ISFQuery<T> addSubAction(String subaction, SFSafeEnum extras);

    URI getLink();

    /**
     * This implies that the query parameters need to be appended by the buildQuery
     * function before executing the query.
     */
    ISFQuery<T> setLink(URI uri);

    String getUserName();

    String getPassword();

    String getHttpMethod();

    ISFQuery<T> setHttpMethod(String string);

    String getBody();

    ISFQuery<T> setBody(Object object);

    boolean constructDownloadSpec();

    String buildQueryUrlString(String server) throws UnsupportedEncodingException;

    ISFQuery<T> setLink(String string) throws URISyntaxException;

    /**
     * This implies that the query parameters are included in the URI and no more parameters more
     * needs to be added before executing the query.
     * Generally we get such URI from Redirection object.
     */
    ISFQuery<T> setFullyParametrizedLink(URI uri);

    boolean canReNewTokenInternally();

    ISFQuery<T> setCredentials(String userName, String password);

    /**
     * For certain calls like create symbolic link we want to disable readahead done by the
     * SDK. This function allows to set the flag to explicity false if required..
     */
    ISFQuery<T> allowRedirection(boolean value);

    boolean reDirectionAllowed();

    <V> ISFQuery<V> expect(Class<V> clazz);

    /**
     * This will append the query paremeters from previuos query to the new link. use this only
     * when re-executing the query for a redirected object.
     * Also , this will ignore the previous params if new query already has some params
     *
     * @throws URISyntaxException
     * @throws UnsupportedEncodingException
     */
    ISFQuery<T> setLinkAndAppendPreviousParameters(URI uri) throws URISyntaxException, UnsupportedEncodingException;

    /**
     * This will append the query paremeters from previuos query to the new link. use this only
     * when re-executing the query for a redirected object.
     * Also , this will ignore the previous params if new query already has some params
     *
     * @throws URISyntaxException
     * @throws UnsupportedEncodingException
     */
    ISFQuery<T> setLinkAndAppendPreviousParameters(String string) throws URISyntaxException, UnsupportedEncodingException;

    ;

    /**
     * simplifies the adding of expansion parameters to the query.
     */
    ISFQuery<T> expand(String expansionParameter);

    ISFQuery<T> top(int topItems);

    ISFQuery<T> skip(int skipItems);

    ISFQuery<T> orderBy(String orderParameter, SFKeywords.DIRECTION direction);

    ISFQuery<T> filter(String filterValue);

    ISFQuery<T> is(SFV3ElementType type);

    ISFQuery<T> select(String name);

    /**
     * This function takes any uri and stores only its base part along with the provider
     * <p>
     * example if you pass: https://szqatest2.sharefiletest.com/cifs/v3/Capabilities
     * <p>
     * this function will store baseLink as : https://szqatest2.sharefiletest.com/cifs/v3/
     */
    ISFQuery<T> setBaseLink(URI uri) throws URISyntaxException;

    T execute() throws SFInvalidStateException, SFServerException,
            SFNotAuthorizedException, SFOAuthTokenRenewException, SFOtherException;

    void executeAsync(ISFApiResultCallback<T> callback);

    /**
     * Get tag set by the setTag function.
     */
    Object getTag();

    /**
     * This will allow the consumer apps to preserve identification information related to queries.
     * The SDK itself never uses this.
     */
    void setTag(Object tag);

    String getStringResponse();

    void setStringResponse(String response);
}