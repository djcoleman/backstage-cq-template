package ${{values.group_id}}.${{values.component_id}};

// camel-k: language=java

import org.apache.camel.builder.RouteBuilder;

public class ${{values.component_id | title}} extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        // Write your routes here, for example:
        from("timer:java?period={{time:1000}}")
            .setBody()
                .simple("Hello Camel from ${routeId}")
            .log("${body}");
    }
}
