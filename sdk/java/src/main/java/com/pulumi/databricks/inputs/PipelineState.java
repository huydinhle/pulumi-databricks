// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.PipelineClusterArgs;
import com.pulumi.databricks.inputs.PipelineFiltersArgs;
import com.pulumi.databricks.inputs.PipelineLibraryArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineState extends com.pulumi.resources.ResourceArgs {

    public static final PipelineState Empty = new PipelineState();

    @Import(name="allowDuplicateNames")
    private @Nullable Output<Boolean> allowDuplicateNames;

    public Optional<Output<Boolean>> allowDuplicateNames() {
        return Optional.ofNullable(this.allowDuplicateNames);
    }

    /**
     * optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `current` (default) and `preview`.
     * 
     */
    @Import(name="channel")
    private @Nullable Output<String> channel;

    /**
     * @return optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `current` (default) and `preview`.
     * 
     */
    public Optional<Output<String>> channel() {
        return Optional.ofNullable(this.channel);
    }

    /**
     * blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*
     * 
     */
    @Import(name="clusters")
    private @Nullable Output<List<PipelineClusterArgs>> clusters;

    /**
     * @return blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*
     * 
     */
    public Optional<Output<List<PipelineClusterArgs>>> clusters() {
        return Optional.ofNullable(this.clusters);
    }

    /**
     * An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<Map<String,Object>> configuration;

    /**
     * @return An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
     * 
     */
    public Optional<Output<Map<String,Object>>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * A flag indicating whether to run the pipeline continuously. The default value is `false`.
     * 
     */
    @Import(name="continuous")
    private @Nullable Output<Boolean> continuous;

    /**
     * @return A flag indicating whether to run the pipeline continuously. The default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> continuous() {
        return Optional.ofNullable(this.continuous);
    }

    /**
     * A flag indicating whether to run the pipeline in development mode. The default value is `false`.
     * 
     */
    @Import(name="development")
    private @Nullable Output<Boolean> development;

    /**
     * @return A flag indicating whether to run the pipeline in development mode. The default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> development() {
        return Optional.ofNullable(this.development);
    }

    /**
     * optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `core`, `pro`, `advanced` (default).
     * 
     */
    @Import(name="edition")
    private @Nullable Output<String> edition;

    /**
     * @return optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `core`, `pro`, `advanced` (default).
     * 
     */
    public Optional<Output<String>> edition() {
        return Optional.ofNullable(this.edition);
    }

    @Import(name="filters")
    private @Nullable Output<PipelineFiltersArgs> filters;

    public Optional<Output<PipelineFiltersArgs>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` type of library that should have the `path` attribute. *Right now only the `notebook` type is supported.*
     * 
     */
    @Import(name="libraries")
    private @Nullable Output<List<PipelineLibraryArgs>> libraries;

    /**
     * @return blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` type of library that should have the `path` attribute. *Right now only the `notebook` type is supported.*
     * 
     */
    public Optional<Output<List<PipelineLibraryArgs>>> libraries() {
        return Optional.ofNullable(this.libraries);
    }

    /**
     * A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A flag indicating whether to use Photon engine. The default value is `false`.
     * 
     */
    @Import(name="photon")
    private @Nullable Output<Boolean> photon;

    /**
     * @return A flag indicating whether to use Photon engine. The default value is `false`.
     * 
     */
    public Optional<Output<Boolean>> photon() {
        return Optional.ofNullable(this.photon);
    }

    /**
     * A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.*
     * 
     */
    @Import(name="storage")
    private @Nullable Output<String> storage;

    /**
     * @return A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.*
     * 
     */
    public Optional<Output<String>> storage() {
        return Optional.ofNullable(this.storage);
    }

    /**
     * The name of a database for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return The name of a database for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private PipelineState() {}

    private PipelineState(PipelineState $) {
        this.allowDuplicateNames = $.allowDuplicateNames;
        this.channel = $.channel;
        this.clusters = $.clusters;
        this.configuration = $.configuration;
        this.continuous = $.continuous;
        this.development = $.development;
        this.edition = $.edition;
        this.filters = $.filters;
        this.libraries = $.libraries;
        this.name = $.name;
        this.photon = $.photon;
        this.storage = $.storage;
        this.target = $.target;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineState $;

        public Builder() {
            $ = new PipelineState();
        }

        public Builder(PipelineState defaults) {
            $ = new PipelineState(Objects.requireNonNull(defaults));
        }

        public Builder allowDuplicateNames(@Nullable Output<Boolean> allowDuplicateNames) {
            $.allowDuplicateNames = allowDuplicateNames;
            return this;
        }

        public Builder allowDuplicateNames(Boolean allowDuplicateNames) {
            return allowDuplicateNames(Output.of(allowDuplicateNames));
        }

        /**
         * @param channel optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `current` (default) and `preview`.
         * 
         * @return builder
         * 
         */
        public Builder channel(@Nullable Output<String> channel) {
            $.channel = channel;
            return this;
        }

        /**
         * @param channel optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `current` (default) and `preview`.
         * 
         * @return builder
         * 
         */
        public Builder channel(String channel) {
            return channel(Output.of(channel));
        }

        /**
         * @param clusters blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*
         * 
         * @return builder
         * 
         */
        public Builder clusters(@Nullable Output<List<PipelineClusterArgs>> clusters) {
            $.clusters = clusters;
            return this;
        }

        /**
         * @param clusters blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*
         * 
         * @return builder
         * 
         */
        public Builder clusters(List<PipelineClusterArgs> clusters) {
            return clusters(Output.of(clusters));
        }

        /**
         * @param clusters blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*
         * 
         * @return builder
         * 
         */
        public Builder clusters(PipelineClusterArgs... clusters) {
            return clusters(List.of(clusters));
        }

        /**
         * @param configuration An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<Map<String,Object>> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
         * 
         * @return builder
         * 
         */
        public Builder configuration(Map<String,Object> configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param continuous A flag indicating whether to run the pipeline continuously. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder continuous(@Nullable Output<Boolean> continuous) {
            $.continuous = continuous;
            return this;
        }

        /**
         * @param continuous A flag indicating whether to run the pipeline continuously. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder continuous(Boolean continuous) {
            return continuous(Output.of(continuous));
        }

        /**
         * @param development A flag indicating whether to run the pipeline in development mode. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder development(@Nullable Output<Boolean> development) {
            $.development = development;
            return this;
        }

        /**
         * @param development A flag indicating whether to run the pipeline in development mode. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder development(Boolean development) {
            return development(Output.of(development));
        }

        /**
         * @param edition optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `core`, `pro`, `advanced` (default).
         * 
         * @return builder
         * 
         */
        public Builder edition(@Nullable Output<String> edition) {
            $.edition = edition;
            return this;
        }

        /**
         * @param edition optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `core`, `pro`, `advanced` (default).
         * 
         * @return builder
         * 
         */
        public Builder edition(String edition) {
            return edition(Output.of(edition));
        }

        public Builder filters(@Nullable Output<PipelineFiltersArgs> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(PipelineFiltersArgs filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param libraries blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` type of library that should have the `path` attribute. *Right now only the `notebook` type is supported.*
         * 
         * @return builder
         * 
         */
        public Builder libraries(@Nullable Output<List<PipelineLibraryArgs>> libraries) {
            $.libraries = libraries;
            return this;
        }

        /**
         * @param libraries blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` type of library that should have the `path` attribute. *Right now only the `notebook` type is supported.*
         * 
         * @return builder
         * 
         */
        public Builder libraries(List<PipelineLibraryArgs> libraries) {
            return libraries(Output.of(libraries));
        }

        /**
         * @param libraries blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` type of library that should have the `path` attribute. *Right now only the `notebook` type is supported.*
         * 
         * @return builder
         * 
         */
        public Builder libraries(PipelineLibraryArgs... libraries) {
            return libraries(List.of(libraries));
        }

        /**
         * @param name A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param photon A flag indicating whether to use Photon engine. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder photon(@Nullable Output<Boolean> photon) {
            $.photon = photon;
            return this;
        }

        /**
         * @param photon A flag indicating whether to use Photon engine. The default value is `false`.
         * 
         * @return builder
         * 
         */
        public Builder photon(Boolean photon) {
            return photon(Output.of(photon));
        }

        /**
         * @param storage A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.*
         * 
         * @return builder
         * 
         */
        public Builder storage(@Nullable Output<String> storage) {
            $.storage = storage;
            return this;
        }

        /**
         * @param storage A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.*
         * 
         * @return builder
         * 
         */
        public Builder storage(String storage) {
            return storage(Output.of(storage));
        }

        /**
         * @param target The name of a database for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The name of a database for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public PipelineState build() {
            return $;
        }
    }

}
