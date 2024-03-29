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

import javax.servlet.*;
import javax.servlet.FilterRegistration.Dynamic;
import javax.servlet.descriptor.JspConfigDescriptor;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Map;
import java.util.Set;

public class MockServletContext implements ServletContext {

    /**
     * @see javax.servlet.ServletContext#addFilter(String, Class)
     */
    @Override
    public Dynamic addFilter(String arg0, Class<? extends Filter> arg1) {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#addFilter(String, javax.servlet.Filter)
     */
    @Override
    public Dynamic addFilter(String arg0, Filter arg1) {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#addFilter(String, String)
     */
    @Override
    public Dynamic addFilter(String arg0, String arg1) {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#addListener(Class)
     */
    @Override
    public void addListener(Class<? extends EventListener> arg0) {

    }

    /**
     * @see javax.servlet.ServletContext#addListener(String)
     */
    @Override
    public void addListener(String arg0) {

    }

    /**
     * @see javax.servlet.ServletContext#addListener(EventListener)
     */
    @Override
    public <T extends EventListener> void addListener(T arg0) {

    }

    /**
     * @see javax.servlet.ServletContext#addServlet(String, Class)
     */
    @Override
    public javax.servlet.ServletRegistration.Dynamic addServlet(String arg0, Class<? extends Servlet> arg1) {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#addServlet(String, javax.servlet.Servlet)
     */
    @Override
    public javax.servlet.ServletRegistration.Dynamic addServlet(String arg0, Servlet arg1) {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#addServlet(String, String)
     */
    @Override
    public javax.servlet.ServletRegistration.Dynamic addServlet(String arg0, String arg1) {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#createFilter(Class)
     */
    @Override
    public <T extends Filter> T createFilter(Class<T> arg0) throws ServletException {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#createListener(Class)
     */
    @Override
    public <T extends EventListener> T createListener(Class<T> arg0) throws ServletException {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#createServlet(Class)
     */
    @Override
    public <T extends Servlet> T createServlet(Class<T> arg0) throws ServletException {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#declareRoles(String[])
     */
    @Override
    public void declareRoles(String... arg0) {

    }

    public String getVirtualServerName() {
        return null;
    }

    @Override
    public Object getAttribute(String arg0) {

        return null;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public Enumeration getAttributeNames() {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#getClassLoader()
     */
    @Override
    public ClassLoader getClassLoader() {

        return null;
    }

    @Override
    public ServletContext getContext(String arg0) {

        return null;
    }

    @Override
    public String getContextPath() {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#getDefaultSessionTrackingModes()
     */
    @Override
    public Set<SessionTrackingMode> getDefaultSessionTrackingModes() {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#getEffectiveMajorVersion()
     */
    @Override
    public int getEffectiveMajorVersion() {

        return 0;
    }

    /**
     * @see javax.servlet.ServletContext#getEffectiveMinorVersion()
     */
    @Override
    public int getEffectiveMinorVersion() {

        return 0;
    }

    /**
     * @see javax.servlet.ServletContext#getEffectiveSessionTrackingModes()
     */
    @Override
    public Set<SessionTrackingMode> getEffectiveSessionTrackingModes() {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#getFilterRegistration(String)
     */
    @Override
    public FilterRegistration getFilterRegistration(String arg0) {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#getFilterRegistrations()
     */
    @Override
    public Map<String, ? extends FilterRegistration> getFilterRegistrations() {

        return null;
    }

    @Override
    public String getInitParameter(String arg0) {

        return null;
    }

    @Override
    public Enumeration<String> getInitParameterNames() {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#getJspConfigDescriptor()
     */
    @Override
    public JspConfigDescriptor getJspConfigDescriptor() {

        return null;
    }

    @Override
    public int getMajorVersion() {

        return 0;
    }

    @Override
    public String getMimeType(String arg0) {

        return null;
    }

    @Override
    public int getMinorVersion() {

        return 0;
    }

    @Override
    public RequestDispatcher getNamedDispatcher(String arg0) {

        return null;
    }

    @Override
    public String getRealPath(String path) {
        path = MockServletContext.class.getResource(path).getFile();
        return path.substring(0, path.length() - "/WEB-INF/classes/".length());
    }

    @Override
    public RequestDispatcher getRequestDispatcher(String arg0) {

        return null;
    }

    @Override
    public URL getResource(String arg0) throws MalformedURLException {

        return null;
    }

    @Override
    public InputStream getResourceAsStream(String arg0) {

        return null;
    }

    @Override
    public Set<String> getResourcePaths(String arg0) {
        return null;
    }

    @Override
    public String getServerInfo() {

        return null;
    }

    @Override
    public Servlet getServlet(String arg0) throws ServletException {

        return null;
    }

    @Override
    public String getServletContextName() {

        return null;
    }

    @Override
    public Enumeration<String> getServletNames() {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#getServletRegistration(String)
     */
    @Override
    public ServletRegistration getServletRegistration(String arg0) {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#getServletRegistrations()
     */
    @Override
    public Map<String, ? extends ServletRegistration> getServletRegistrations() {

        return null;
    }

    @Override
    public Enumeration<Servlet> getServlets() {

        return null;
    }

    /**
     * @see javax.servlet.ServletContext#getSessionCookieConfig()
     */
    @Override
    public SessionCookieConfig getSessionCookieConfig() {

        return null;
    }

    @Override
    public void log(Exception arg0, String arg1) {

    }

    @Override
    public void log(String arg0) {

    }

    @Override
    public void log(String arg0, Throwable arg1) {

    }

    @Override
    public void removeAttribute(String arg0) {

    }

    @Override
    public void setAttribute(String arg0, Object arg1) {

    }

    /**
     * @see javax.servlet.ServletContext#setInitParameter(String, String)
     */
    @Override
    public boolean setInitParameter(String arg0, String arg1) {

        return false;
    }

    /**
     * @see javax.servlet.ServletContext#setSessionTrackingModes(Set)
     */
    @Override
    public void setSessionTrackingModes(Set<SessionTrackingMode> arg0) {

    }

}
