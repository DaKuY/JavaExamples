/*
 * An XML document type.
 * Localname: name
 * Namespace: 
 * Java type: andrewNamespace.xsdconfig.NameDocument
 *
 * Automatically generated - do not modify.
 */
package andrewNamespace.xsdconfig;


/**
 * A document containing one name(@) element.
 *
 * This is a complex type.
 */
public interface NameDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s477F0D6FD64261F550E4C033021B8E48").resolveHandle("name9e84doctype");
    
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
     * An XML name(@).
     *
     * This is an atomic type that is a restriction of andrewNamespace.xsdconfig.NameDocument$Name.
     */
    public interface Name extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s477F0D6FD64261F550E4C033021B8E48").resolveHandle("name858delemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum DOUG = Enum.forString("Doug");
        static final Enum STEPH = Enum.forString("Steph");
        static final Enum ANDREW = Enum.forString("Andrew");
        
        static final int INT_DOUG = Enum.INT_DOUG;
        static final int INT_STEPH = Enum.INT_STEPH;
        static final int INT_ANDREW = Enum.INT_ANDREW;
        
        /**
         * Enumeration value class for andrewNamespace.xsdconfig.NameDocument$Name.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_DOUG
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_DOUG = 1;
            static final int INT_STEPH = 2;
            static final int INT_ANDREW = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Doug", INT_DOUG),
                    new Enum("Steph", INT_STEPH),
                    new Enum("Andrew", INT_ANDREW),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static andrewNamespace.xsdconfig.NameDocument.Name newValue(java.lang.Object obj) {
              return (andrewNamespace.xsdconfig.NameDocument.Name) type.newValue( obj ); }
            
            public static andrewNamespace.xsdconfig.NameDocument.Name newInstance() {
              return (andrewNamespace.xsdconfig.NameDocument.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static andrewNamespace.xsdconfig.NameDocument.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (andrewNamespace.xsdconfig.NameDocument.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static andrewNamespace.xsdconfig.NameDocument newInstance() {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static andrewNamespace.xsdconfig.NameDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static andrewNamespace.xsdconfig.NameDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static andrewNamespace.xsdconfig.NameDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static andrewNamespace.xsdconfig.NameDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static andrewNamespace.xsdconfig.NameDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static andrewNamespace.xsdconfig.NameDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static andrewNamespace.xsdconfig.NameDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static andrewNamespace.xsdconfig.NameDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static andrewNamespace.xsdconfig.NameDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static andrewNamespace.xsdconfig.NameDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static andrewNamespace.xsdconfig.NameDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static andrewNamespace.xsdconfig.NameDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static andrewNamespace.xsdconfig.NameDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static andrewNamespace.xsdconfig.NameDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static andrewNamespace.xsdconfig.NameDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static andrewNamespace.xsdconfig.NameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static andrewNamespace.xsdconfig.NameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (andrewNamespace.xsdconfig.NameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
