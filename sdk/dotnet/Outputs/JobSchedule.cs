// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class JobSchedule
    {
        /// <summary>
        /// Indicate whether this schedule is paused or not. Either “PAUSED” or “UNPAUSED”. When the pause_status field is omitted and a schedule is provided, the server will default to using "UNPAUSED" as a value for pause_status.
        /// </summary>
        public readonly string? PauseStatus;
        /// <summary>
        /// A [Cron expression using Quartz syntax](http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html) that describes the schedule for a job. This field is required.
        /// </summary>
        public readonly string QuartzCronExpression;
        /// <summary>
        /// A Java timezone ID. The schedule for a job will be resolved with respect to this timezone. See Java TimeZone for details. This field is required.
        /// </summary>
        public readonly string TimezoneId;

        [OutputConstructor]
        private JobSchedule(
            string? pauseStatus,

            string quartzCronExpression,

            string timezoneId)
        {
            PauseStatus = pauseStatus;
            QuartzCronExpression = quartzCronExpression;
            TimezoneId = timezoneId;
        }
    }
}