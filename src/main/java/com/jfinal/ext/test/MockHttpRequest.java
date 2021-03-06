/**
 * Copyright (c) 2011-2013, kidzhou 周磊 (zhouleib1412@gmail.com)
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jfinal.ext.test;

import com.google.common.collect.Maps;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.security.Principal;
import java.util.*;

public class MockHttpRequest implements HttpServletRequest {
    private Map<String, Object> attr = Maps.newHashMap();

    private Map<String, String> para = Maps.newHashMap();

    private String httpMethod = "GET";

    private String url;
    private String queryString;

    private String body;

    public MockHttpRequest(String url, String body) {
        this.url = url;
        this.body = body;

        if (url.contains("?")) {
            queryString = url.substring(url.indexOf("?") + 1);
        }
    }

    @Override
    public boolean authenticate(HttpServletResponse arg0) throws IOException, ServletException {
        return false;
    }

    @Override
    public AsyncContext getAsyncContext() {
        return null;
    }

    @Override
    public Object getAttribute(String key) {
        return attr.get(key);
    }

    @Override
    public Enumeration<String> getAttributeNames() {
        Hashtable<String, Object> attrTable = new Hashtable<String, Object>();
        for (Map.Entry<String, Object> entry : attr.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                attrTable.put(entry.getKey(), entry.getValue());
            }
        }
        return attrTable.keys();
    }

    @Override
    public String getAuthType() {
        return null;
    }

    @Override
    public String getCharacterEncoding() {
        return "UTF-8";
    }

    @Override
    public void setCharacterEncoding(String arg0) throws UnsupportedEncodingException {

    }

    @Override
    public int getContentLength() {
        return 0;
    }

    public long getContentLengthLong() {
        return 0;
    }

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public String getContextPath() {
        return null;
    }

    @Override
    public Cookie[] getCookies() {
        return null;
    }

    @Override
    public long getDateHeader(String arg0) {
        return 0;
    }

    @Override
    public DispatcherType getDispatcherType() {
        return null;
    }

    @Override
    public String getHeader(String arg0) {
        return null;
    }

    @Override
    public Enumeration<String> getHeaderNames() {
        return null;
    }

    @Override
    public Enumeration<String> getHeaders(String arg0) {
        return null;
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        return new MockServletInputStream(body);
    }

    @Override
    public int getIntHeader(String arg0) {
        return 0;
    }

    @Override
    public String getLocalAddr() {
        return null;
    }

    @Override
    public Locale getLocale() {
        return null;
    }

    @Override
    public Enumeration<Locale> getLocales() {
        return null;
    }

    @Override
    public String getLocalName() {
        return null;
    }

    @Override
    public int getLocalPort() {
        return 0;
    }

    @Override
    public String getMethod() {
        return httpMethod;
    }

    public void setMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Override
    public String getParameter(String key) {
        return para.get(key);
    }

    @Override
    public Map<String, String[]> getParameterMap() {
        return null;
    }

    @Override
    public Enumeration<String> getParameterNames() {
        return new Hashtable<String, Object>(para).keys();
    }

    @Override
    public String[] getParameterValues(String key) {
        return new String[]{para.get(key)};
    }

    @Override
    public Part getPart(String arg0) throws IOException, ServletException {
        return null;
    }

    @Override
    public Collection<Part> getParts() throws IOException, ServletException {
        return null;
    }

    @Override
    public String getPathInfo() {
        return null;
    }

    @Override
    public String getPathTranslated() {
        return null;
    }

    @Override
    public String getProtocol() {
        return null;
    }

    @Override
    public String getQueryString() {
        return queryString;
    }

    @Override
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(body.getBytes("UTF-8"))));
    }

    @Override
    public String getRealPath(String arg0) {
        return null;
    }

    @Override
    public String getRemoteAddr() {
        return null;
    }

    @Override
    public String getRemoteHost() {
        return null;
    }

    @Override
    public int getRemotePort() {
        return 0;
    }

    @Override
    public String getRemoteUser() {
        return null;
    }

    @Override
    public RequestDispatcher getRequestDispatcher(final String view) {
        return new RequestDispatcher() {
            @Override
            public void forward(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
                System.out.println();
                System.out.println("JFinal view report -----------------------------------");
                System.out.println("forward to view :" + view);
                System.out.println("------------------------------------------------------");
            }

            @Override
            public void include(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {

            }
        };
    }

    @Override
    public String getRequestedSessionId() {
        return null;
    }

    @Override
    public String getRequestURI() {
        return url;
    }

    @Override
    public StringBuffer getRequestURL() {
        return new StringBuffer(url);
    }

    @Override
    public String getScheme() {
        return null;
    }

    @Override
    public String getServerName() {
        return null;
    }

    @Override
    public int getServerPort() {
        return 0;
    }

    @Override
    public ServletContext getServletContext() {
        return null;
    }

    @Override
    public String getServletPath() {
        return null;
    }

    @Override
    public HttpSession getSession() {
        return null;
    }

    public String changeSessionId() {
        return null;
    }

    @Override
    public HttpSession getSession(boolean arg0) {
        return null;
    }

    @Override
    public Principal getUserPrincipal() {
        return null;
    }

    @Override
    public boolean isAsyncStarted() {
        return false;
    }

    @Override
    public boolean isAsyncSupported() {
        return false;
    }

    @Override
    public boolean isRequestedSessionIdFromCookie() {
        return false;
    }

    @Override
    public boolean isRequestedSessionIdFromUrl() {
        return false;
    }

    @Override
    public boolean isRequestedSessionIdFromURL() {
        return false;
    }

    @Override
    public boolean isRequestedSessionIdValid() {
        return false;
    }

    @Override
    public boolean isSecure() {
        return false;
    }

    @Override
    public boolean isUserInRole(String arg0) {
        return false;
    }

    @Override
    public void login(String arg0, String arg1) throws ServletException {

    }

    @Override
    public void logout() throws ServletException {

    }

    @Override
    public void removeAttribute(String arg0) {

    }

    @Override
    public void setAttribute(String key, Object value) {
        attr.put(key, value);
    }

    public void setParameter(String key, String val) {
        para.put(key, val);
    }

    @Override
    public AsyncContext startAsync() {
        return null;
    }

    @Override
    public AsyncContext startAsync(ServletRequest arg0, ServletResponse arg1) {
        return null;
    }

}
