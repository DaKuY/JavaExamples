/*
 * An XML document type.
 * Localname: employee
 * Namespace: 
 * Java type: andrewNamespace.xsdconfig.EmployeeDocument
 *
 * Automatically generated - do not modify.
 */
package andrewNamespace.xsdconfig;


/**
 * A document containing one employee(@) element.
 *
 * This is a complex type.
 */
public interface EmployeeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EmployeeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s477F0D6FD64261F550E4C033021B8E48").resolveHandle("employee6627doctype");
    
    /**
     * Gets the "employee" element
     */
    andrewNamespace.xsdconfig.EmployeeDocument.Employee getEmployee();
    
    /**
     * Sets the "employee" element
     */
    void setEmployee(andrewNamespace.xsdconfig.EmployeeDocument.Employee employee);
    
    /**
     * Appends and returns a new empty "employee" element
     */
    andrewNamespace.xsdconfig.EmployeeDocument.Employee addNewEmployee();
    
    /**
     * An XML employee(@).
     *
     * This is a complex type.
     */
    public interface Employee extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Employee.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s477F0D6FD64261F550E4C033021B8E48").resolveHandle("employee54adelemtype");
        
        /**
         * Gets the "name" element
         */
        andrewNamespace.xsdconfig.NameDocument.Name.Enum getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        andrewNamespace.xsdconfig.NameDocument.Name xgetName();
        
        /**
         * Sets the "name" element
         */
        void setName(andrewNamespace.xsdconfig.NameDocument.Name.Enum name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(andrewNamespace.xsdconfig.NameDocument.Name name);
        
        /**
         * Gets the "nickname" element
         */
        java.lang.String getNickname();
        
        /**
         * Gets (as xml) the "nickname" element
         */
        org.apache.xmlbeans.XmlString xgetNickname();
        
        /**
         * Sets the "nickname" element
         */
        void setNickname(java.lang.String nickname);
        
        /**
         * Sets (as xml) the "nickname" element
         */
        void xsetNickname(org.apache.xmlbeans.XmlString nickname);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static andrewNamespace.xsdconfig.EmployeeDocument.Employee newInstance() {
              return (andrewNamespace.xsdconfig.EmployeeDocument.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static andrewNamespace.xsdconfig.EmployeeDocument.Employee newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (andrewNamespace.xsdconfig.EmployeeDocument.Employee) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static andrewNamespace.xsdconfig.EmployeeDocument newInstance() {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static andrewNamespace.xsdconfig.EmployeeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static andrewNamespace.xsdconfig.EmployeeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (andrewNamespace.xsdconfig.EmployeeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
