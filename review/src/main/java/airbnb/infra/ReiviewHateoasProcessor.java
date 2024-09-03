package airbnb.infra;

import airbnb.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ReiviewHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Reiview>> {

    @Override
    public EntityModel<Reiview> process(EntityModel<Reiview> model) {
        return model;
    }
}
