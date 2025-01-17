// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskNotebookTask {
    /**
     * @return (Map) Base parameters to be used for each run of this job. If the run is initiated by a call to run-now with parameters specified, the two parameters maps will be merged. If the same key is specified in base_parameters and in run-now, the value from run-now will be used. If the notebook takes a parameter that is not specified in the job’s base_parameters or the run-now override parameters, the default value from the notebook will be used. Retrieve these parameters in a notebook using `dbutils.widgets.get`.
     * 
     */
    private final @Nullable Map<String,Object> baseParameters;
    /**
     * @return The absolute path of the databricks.Notebook to be run in the Databricks workspace. This path must begin with a slash. This field is required.
     * 
     */
    private final String notebookPath;

    @CustomType.Constructor
    private JobTaskNotebookTask(
        @CustomType.Parameter("baseParameters") @Nullable Map<String,Object> baseParameters,
        @CustomType.Parameter("notebookPath") String notebookPath) {
        this.baseParameters = baseParameters;
        this.notebookPath = notebookPath;
    }

    /**
     * @return (Map) Base parameters to be used for each run of this job. If the run is initiated by a call to run-now with parameters specified, the two parameters maps will be merged. If the same key is specified in base_parameters and in run-now, the value from run-now will be used. If the notebook takes a parameter that is not specified in the job’s base_parameters or the run-now override parameters, the default value from the notebook will be used. Retrieve these parameters in a notebook using `dbutils.widgets.get`.
     * 
     */
    public Map<String,Object> baseParameters() {
        return this.baseParameters == null ? Map.of() : this.baseParameters;
    }
    /**
     * @return The absolute path of the databricks.Notebook to be run in the Databricks workspace. This path must begin with a slash. This field is required.
     * 
     */
    public String notebookPath() {
        return this.notebookPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskNotebookTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> baseParameters;
        private String notebookPath;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTaskNotebookTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseParameters = defaults.baseParameters;
    	      this.notebookPath = defaults.notebookPath;
        }

        public Builder baseParameters(@Nullable Map<String,Object> baseParameters) {
            this.baseParameters = baseParameters;
            return this;
        }
        public Builder notebookPath(String notebookPath) {
            this.notebookPath = Objects.requireNonNull(notebookPath);
            return this;
        }        public JobTaskNotebookTask build() {
            return new JobTaskNotebookTask(baseParameters, notebookPath);
        }
    }
}
