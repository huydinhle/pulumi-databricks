// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MlflowWebhookJobSpec {
    /**
     * @return The personal access token used to authorize webhook&#39;s job runs.
     * 
     */
    private final String accessToken;
    /**
     * @return ID of the Databricks job that the webhook runs.
     * 
     */
    private final String jobId;
    /**
     * @return URL of the workspace containing the job that this webhook runs. If not specified, the job’s workspace URL is assumed to be the same as the workspace where the webhook is created.
     * 
     */
    private final @Nullable String workspaceUrl;

    @CustomType.Constructor
    private MlflowWebhookJobSpec(
        @CustomType.Parameter("accessToken") String accessToken,
        @CustomType.Parameter("jobId") String jobId,
        @CustomType.Parameter("workspaceUrl") @Nullable String workspaceUrl) {
        this.accessToken = accessToken;
        this.jobId = jobId;
        this.workspaceUrl = workspaceUrl;
    }

    /**
     * @return The personal access token used to authorize webhook&#39;s job runs.
     * 
     */
    public String accessToken() {
        return this.accessToken;
    }
    /**
     * @return ID of the Databricks job that the webhook runs.
     * 
     */
    public String jobId() {
        return this.jobId;
    }
    /**
     * @return URL of the workspace containing the job that this webhook runs. If not specified, the job’s workspace URL is assumed to be the same as the workspace where the webhook is created.
     * 
     */
    public Optional<String> workspaceUrl() {
        return Optional.ofNullable(this.workspaceUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MlflowWebhookJobSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessToken;
        private String jobId;
        private @Nullable String workspaceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(MlflowWebhookJobSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.jobId = defaults.jobId;
    	      this.workspaceUrl = defaults.workspaceUrl;
        }

        public Builder accessToken(String accessToken) {
            this.accessToken = Objects.requireNonNull(accessToken);
            return this;
        }
        public Builder jobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }
        public Builder workspaceUrl(@Nullable String workspaceUrl) {
            this.workspaceUrl = workspaceUrl;
            return this;
        }        public MlflowWebhookJobSpec build() {
            return new MlflowWebhookJobSpec(accessToken, jobId, workspaceUrl);
        }
    }
}
