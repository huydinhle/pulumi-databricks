// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class JobTaskPipelineTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskPipelineTaskArgs Empty = new JobTaskPipelineTaskArgs();

    /**
     * The pipeline&#39;s unique ID.
     * 
     */
    @Import(name="pipelineId", required=true)
    private Output<String> pipelineId;

    /**
     * @return The pipeline&#39;s unique ID.
     * 
     */
    public Output<String> pipelineId() {
        return this.pipelineId;
    }

    private JobTaskPipelineTaskArgs() {}

    private JobTaskPipelineTaskArgs(JobTaskPipelineTaskArgs $) {
        this.pipelineId = $.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskPipelineTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskPipelineTaskArgs $;

        public Builder() {
            $ = new JobTaskPipelineTaskArgs();
        }

        public Builder(JobTaskPipelineTaskArgs defaults) {
            $ = new JobTaskPipelineTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pipelineId The pipeline&#39;s unique ID.
         * 
         * @return builder
         * 
         */
        public Builder pipelineId(Output<String> pipelineId) {
            $.pipelineId = pipelineId;
            return this;
        }

        /**
         * @param pipelineId The pipeline&#39;s unique ID.
         * 
         * @return builder
         * 
         */
        public Builder pipelineId(String pipelineId) {
            return pipelineId(Output.of(pipelineId));
        }

        public JobTaskPipelineTaskArgs build() {
            $.pipelineId = Objects.requireNonNull($.pipelineId, "expected parameter 'pipelineId' to be non-null");
            return $;
        }
    }

}
