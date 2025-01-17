// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskDbtTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskDbtTaskArgs Empty = new JobTaskDbtTaskArgs();

    @Import(name="commands", required=true)
    private Output<List<String>> commands;

    public Output<List<String>> commands() {
        return this.commands;
    }

    @Import(name="projectDirectory")
    private @Nullable Output<String> projectDirectory;

    public Optional<Output<String>> projectDirectory() {
        return Optional.ofNullable(this.projectDirectory);
    }

    @Import(name="schema")
    private @Nullable Output<String> schema;

    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    private JobTaskDbtTaskArgs() {}

    private JobTaskDbtTaskArgs(JobTaskDbtTaskArgs $) {
        this.commands = $.commands;
        this.projectDirectory = $.projectDirectory;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskDbtTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskDbtTaskArgs $;

        public Builder() {
            $ = new JobTaskDbtTaskArgs();
        }

        public Builder(JobTaskDbtTaskArgs defaults) {
            $ = new JobTaskDbtTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder commands(Output<List<String>> commands) {
            $.commands = commands;
            return this;
        }

        public Builder commands(List<String> commands) {
            return commands(Output.of(commands));
        }

        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }

        public Builder projectDirectory(@Nullable Output<String> projectDirectory) {
            $.projectDirectory = projectDirectory;
            return this;
        }

        public Builder projectDirectory(String projectDirectory) {
            return projectDirectory(Output.of(projectDirectory));
        }

        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public JobTaskDbtTaskArgs build() {
            $.commands = Objects.requireNonNull($.commands, "expected parameter 'commands' to be non-null");
            return $;
        }
    }

}
