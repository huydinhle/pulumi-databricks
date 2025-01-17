// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskDbtTaskArgs : global::Pulumi.ResourceArgs
    {
        [Input("commands", required: true)]
        private InputList<string>? _commands;
        public InputList<string> Commands
        {
            get => _commands ?? (_commands = new InputList<string>());
            set => _commands = value;
        }

        [Input("projectDirectory")]
        public Input<string>? ProjectDirectory { get; set; }

        [Input("schema")]
        public Input<string>? Schema { get; set; }

        public JobTaskDbtTaskArgs()
        {
        }
        public static new JobTaskDbtTaskArgs Empty => new JobTaskDbtTaskArgs();
    }
}
