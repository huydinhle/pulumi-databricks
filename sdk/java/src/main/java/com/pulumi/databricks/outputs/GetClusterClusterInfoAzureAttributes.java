// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterClusterInfoAzureAttributes {
    private final @Nullable String availability;
    private final @Nullable Integer firstOnDemand;
    private final @Nullable Double spotBidMaxPrice;

    @CustomType.Constructor
    private GetClusterClusterInfoAzureAttributes(
        @CustomType.Parameter("availability") @Nullable String availability,
        @CustomType.Parameter("firstOnDemand") @Nullable Integer firstOnDemand,
        @CustomType.Parameter("spotBidMaxPrice") @Nullable Double spotBidMaxPrice) {
        this.availability = availability;
        this.firstOnDemand = firstOnDemand;
        this.spotBidMaxPrice = spotBidMaxPrice;
    }

    public Optional<String> availability() {
        return Optional.ofNullable(this.availability);
    }
    public Optional<Integer> firstOnDemand() {
        return Optional.ofNullable(this.firstOnDemand);
    }
    public Optional<Double> spotBidMaxPrice() {
        return Optional.ofNullable(this.spotBidMaxPrice);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterInfoAzureAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availability;
        private @Nullable Integer firstOnDemand;
        private @Nullable Double spotBidMaxPrice;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterClusterInfoAzureAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.firstOnDemand = defaults.firstOnDemand;
    	      this.spotBidMaxPrice = defaults.spotBidMaxPrice;
        }

        public Builder availability(@Nullable String availability) {
            this.availability = availability;
            return this;
        }
        public Builder firstOnDemand(@Nullable Integer firstOnDemand) {
            this.firstOnDemand = firstOnDemand;
            return this;
        }
        public Builder spotBidMaxPrice(@Nullable Double spotBidMaxPrice) {
            this.spotBidMaxPrice = spotBidMaxPrice;
            return this;
        }        public GetClusterClusterInfoAzureAttributes build() {
            return new GetClusterClusterInfoAzureAttributes(availability, firstOnDemand, spotBidMaxPrice);
        }
    }
}
