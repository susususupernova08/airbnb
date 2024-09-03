package airbnb.domain;

import airbnb.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "reiviews", path = "reiviews")
public interface ReiviewRepository
    extends PagingAndSortingRepository<Reiview, Long> {}
