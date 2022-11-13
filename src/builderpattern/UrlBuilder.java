package builderpattern;

public class UrlBuilder {
    public static class Builder{
        private String protocol;
        private String host;
        private String port;
        private String pathParam;
        private String queryParam;

        public UrlBuilder build()
        {
            return new UrlBuilder(this);
        }

        public Builder protocol(String protocol)
        {
            this.protocol = protocol;
            return this;
        }

        public Builder host(String host)
        {
            this.host = host;
            return this;
        }

        public Builder port(String port)
        {
            this.port = port;
            return this;
        }

        public Builder pathParam(String pathParam)
        {
            this.pathParam = pathParam;
            return this;
        }

        public Builder queryParam(String queryParam)
        {
            this.queryParam = queryParam;
            return this;
        }


    }
    public final String protocol;
    public final String host;
    public final String port;
    public final String pathParam;
    public final String queryParam;

    private UrlBuilder(Builder builder)
    {
        this.protocol = builder.protocol;
        this.host = builder.host;
        this.port = builder.port;
        this.pathParam = builder.pathParam;
        this.queryParam = builder.queryParam;
    }
}
