// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSparkVersionResult {
    private final @Nullable Boolean beta;
    private final @Nullable Boolean genomics;
    private final @Nullable Boolean gpu;
    private final @Nullable Boolean graviton;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Boolean latest;
    private final @Nullable Boolean longTermSupport;
    private final @Nullable Boolean ml;
    private final @Nullable Boolean photon;
    private final @Nullable String scala;
    private final @Nullable String sparkVersion;

    @CustomType.Constructor
    private GetSparkVersionResult(
        @CustomType.Parameter("beta") @Nullable Boolean beta,
        @CustomType.Parameter("genomics") @Nullable Boolean genomics,
        @CustomType.Parameter("gpu") @Nullable Boolean gpu,
        @CustomType.Parameter("graviton") @Nullable Boolean graviton,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("latest") @Nullable Boolean latest,
        @CustomType.Parameter("longTermSupport") @Nullable Boolean longTermSupport,
        @CustomType.Parameter("ml") @Nullable Boolean ml,
        @CustomType.Parameter("photon") @Nullable Boolean photon,
        @CustomType.Parameter("scala") @Nullable String scala,
        @CustomType.Parameter("sparkVersion") @Nullable String sparkVersion) {
        this.beta = beta;
        this.genomics = genomics;
        this.gpu = gpu;
        this.graviton = graviton;
        this.id = id;
        this.latest = latest;
        this.longTermSupport = longTermSupport;
        this.ml = ml;
        this.photon = photon;
        this.scala = scala;
        this.sparkVersion = sparkVersion;
    }

    public Optional<Boolean> beta() {
        return Optional.ofNullable(this.beta);
    }
    public Optional<Boolean> genomics() {
        return Optional.ofNullable(this.genomics);
    }
    public Optional<Boolean> gpu() {
        return Optional.ofNullable(this.gpu);
    }
    public Optional<Boolean> graviton() {
        return Optional.ofNullable(this.graviton);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> latest() {
        return Optional.ofNullable(this.latest);
    }
    public Optional<Boolean> longTermSupport() {
        return Optional.ofNullable(this.longTermSupport);
    }
    public Optional<Boolean> ml() {
        return Optional.ofNullable(this.ml);
    }
    public Optional<Boolean> photon() {
        return Optional.ofNullable(this.photon);
    }
    public Optional<String> scala() {
        return Optional.ofNullable(this.scala);
    }
    public Optional<String> sparkVersion() {
        return Optional.ofNullable(this.sparkVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSparkVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean beta;
        private @Nullable Boolean genomics;
        private @Nullable Boolean gpu;
        private @Nullable Boolean graviton;
        private String id;
        private @Nullable Boolean latest;
        private @Nullable Boolean longTermSupport;
        private @Nullable Boolean ml;
        private @Nullable Boolean photon;
        private @Nullable String scala;
        private @Nullable String sparkVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSparkVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beta = defaults.beta;
    	      this.genomics = defaults.genomics;
    	      this.gpu = defaults.gpu;
    	      this.graviton = defaults.graviton;
    	      this.id = defaults.id;
    	      this.latest = defaults.latest;
    	      this.longTermSupport = defaults.longTermSupport;
    	      this.ml = defaults.ml;
    	      this.photon = defaults.photon;
    	      this.scala = defaults.scala;
    	      this.sparkVersion = defaults.sparkVersion;
        }

        public Builder beta(@Nullable Boolean beta) {
            this.beta = beta;
            return this;
        }
        public Builder genomics(@Nullable Boolean genomics) {
            this.genomics = genomics;
            return this;
        }
        public Builder gpu(@Nullable Boolean gpu) {
            this.gpu = gpu;
            return this;
        }
        public Builder graviton(@Nullable Boolean graviton) {
            this.graviton = graviton;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder latest(@Nullable Boolean latest) {
            this.latest = latest;
            return this;
        }
        public Builder longTermSupport(@Nullable Boolean longTermSupport) {
            this.longTermSupport = longTermSupport;
            return this;
        }
        public Builder ml(@Nullable Boolean ml) {
            this.ml = ml;
            return this;
        }
        public Builder photon(@Nullable Boolean photon) {
            this.photon = photon;
            return this;
        }
        public Builder scala(@Nullable String scala) {
            this.scala = scala;
            return this;
        }
        public Builder sparkVersion(@Nullable String sparkVersion) {
            this.sparkVersion = sparkVersion;
            return this;
        }        public GetSparkVersionResult build() {
            return new GetSparkVersionResult(beta, genomics, gpu, graviton, id, latest, longTermSupport, ml, photon, scala, sparkVersion);
        }
    }
}
