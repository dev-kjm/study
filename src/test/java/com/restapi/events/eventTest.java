package com.restapi.events;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EventTest {

    @Test
    public void builder(){
        Event event = Event.builder()
                .name("spring study")
                .description("rest api spring study")
                .build();

        assertThat(event).isNotNull();
    }

    @Test
    public void javaBean(){
        // given
        String study = "study";
        String restApiStuddy = "rest api studdy";

        // when
        Event event = new Event();
        event.setName(study);
        event.setDescription(restApiStuddy);

        // then
        assertThat(event.getName()).isEqualTo(study);
        assertThat(event.getDescription()).isEqualTo(restApiStuddy);

    }
}