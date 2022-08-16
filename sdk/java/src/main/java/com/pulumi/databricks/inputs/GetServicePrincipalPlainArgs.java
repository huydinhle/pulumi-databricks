// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServicePrincipalPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServicePrincipalPlainArgs Empty = new GetServicePrincipalPlainArgs();

    /**
     * Whether service principal is active or not.
     * 
     */
    @Import(name="active")
    private @Nullable Boolean active;

    /**
     * @return Whether service principal is active or not.
     * 
     */
    public Optional<Boolean> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * ID of the service principal. The service principal must exist before this resource can be retrieved.
     * 
     */
    @Import(name="applicationId")
    private @Nullable String applicationId;

    /**
     * @return ID of the service principal. The service principal must exist before this resource can be retrieved.
     * 
     */
    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * Display name of the service principal, e.g. `Foo SPN`.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return Display name of the service principal, e.g. `Foo SPN`.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * ID of the service principal in an external identity provider.
     * 
     */
    @Import(name="externalId")
    private @Nullable String externalId;

    /**
     * @return ID of the service principal in an external identity provider.
     * 
     */
    public Optional<String> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
     * 
     */
    @Import(name="home")
    private @Nullable String home;

    /**
     * @return Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
     * 
     */
    public Optional<String> home() {
        return Optional.ofNullable(this.home);
    }

    /**
     * Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
     * 
     */
    @Import(name="repos")
    private @Nullable String repos;

    /**
     * @return Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
     * 
     */
    public Optional<String> repos() {
        return Optional.ofNullable(this.repos);
    }

    /**
     * The id of the service principal.
     * 
     */
    @Import(name="spId")
    private @Nullable String spId;

    /**
     * @return The id of the service principal.
     * 
     */
    public Optional<String> spId() {
        return Optional.ofNullable(this.spId);
    }

    private GetServicePrincipalPlainArgs() {}

    private GetServicePrincipalPlainArgs(GetServicePrincipalPlainArgs $) {
        this.active = $.active;
        this.applicationId = $.applicationId;
        this.displayName = $.displayName;
        this.externalId = $.externalId;
        this.home = $.home;
        this.repos = $.repos;
        this.spId = $.spId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServicePrincipalPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServicePrincipalPlainArgs $;

        public Builder() {
            $ = new GetServicePrincipalPlainArgs();
        }

        public Builder(GetServicePrincipalPlainArgs defaults) {
            $ = new GetServicePrincipalPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Whether service principal is active or not.
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Boolean active) {
            $.active = active;
            return this;
        }

        /**
         * @param applicationId ID of the service principal. The service principal must exist before this resource can be retrieved.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable String applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param displayName Display name of the service principal, e.g. `Foo SPN`.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param externalId ID of the service principal in an external identity provider.
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable String externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param home Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
         * 
         * @return builder
         * 
         */
        public Builder home(@Nullable String home) {
            $.home = home;
            return this;
        }

        /**
         * @param repos Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
         * 
         * @return builder
         * 
         */
        public Builder repos(@Nullable String repos) {
            $.repos = repos;
            return this;
        }

        /**
         * @param spId The id of the service principal.
         * 
         * @return builder
         * 
         */
        public Builder spId(@Nullable String spId) {
            $.spId = spId;
            return this;
        }

        public GetServicePrincipalPlainArgs build() {
            return $;
        }
    }

}
