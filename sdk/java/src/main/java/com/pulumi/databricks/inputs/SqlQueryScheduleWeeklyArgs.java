// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlQueryScheduleWeeklyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlQueryScheduleWeeklyArgs Empty = new SqlQueryScheduleWeeklyArgs();

    @Import(name="dayOfWeek", required=true)
    private Output<String> dayOfWeek;

    public Output<String> dayOfWeek() {
        return this.dayOfWeek;
    }

    @Import(name="intervalWeeks", required=true)
    private Output<Integer> intervalWeeks;

    public Output<Integer> intervalWeeks() {
        return this.intervalWeeks;
    }

    @Import(name="timeOfDay", required=true)
    private Output<String> timeOfDay;

    public Output<String> timeOfDay() {
        return this.timeOfDay;
    }

    @Import(name="untilDate")
    private @Nullable Output<String> untilDate;

    public Optional<Output<String>> untilDate() {
        return Optional.ofNullable(this.untilDate);
    }

    private SqlQueryScheduleWeeklyArgs() {}

    private SqlQueryScheduleWeeklyArgs(SqlQueryScheduleWeeklyArgs $) {
        this.dayOfWeek = $.dayOfWeek;
        this.intervalWeeks = $.intervalWeeks;
        this.timeOfDay = $.timeOfDay;
        this.untilDate = $.untilDate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlQueryScheduleWeeklyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlQueryScheduleWeeklyArgs $;

        public Builder() {
            $ = new SqlQueryScheduleWeeklyArgs();
        }

        public Builder(SqlQueryScheduleWeeklyArgs defaults) {
            $ = new SqlQueryScheduleWeeklyArgs(Objects.requireNonNull(defaults));
        }

        public Builder dayOfWeek(Output<String> dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        public Builder dayOfWeek(String dayOfWeek) {
            return dayOfWeek(Output.of(dayOfWeek));
        }

        public Builder intervalWeeks(Output<Integer> intervalWeeks) {
            $.intervalWeeks = intervalWeeks;
            return this;
        }

        public Builder intervalWeeks(Integer intervalWeeks) {
            return intervalWeeks(Output.of(intervalWeeks));
        }

        public Builder timeOfDay(Output<String> timeOfDay) {
            $.timeOfDay = timeOfDay;
            return this;
        }

        public Builder timeOfDay(String timeOfDay) {
            return timeOfDay(Output.of(timeOfDay));
        }

        public Builder untilDate(@Nullable Output<String> untilDate) {
            $.untilDate = untilDate;
            return this;
        }

        public Builder untilDate(String untilDate) {
            return untilDate(Output.of(untilDate));
        }

        public SqlQueryScheduleWeeklyArgs build() {
            $.dayOfWeek = Objects.requireNonNull($.dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
            $.intervalWeeks = Objects.requireNonNull($.intervalWeeks, "expected parameter 'intervalWeeks' to be non-null");
            $.timeOfDay = Objects.requireNonNull($.timeOfDay, "expected parameter 'timeOfDay' to be non-null");
            return $;
        }
    }

}
