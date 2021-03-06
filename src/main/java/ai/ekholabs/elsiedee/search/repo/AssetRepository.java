package ai.ekholabs.elsiedee.search.repo;

import ai.ekholabs.elsiedee.search.model.Asset;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends ElasticsearchRepository<Asset, String> {
}
