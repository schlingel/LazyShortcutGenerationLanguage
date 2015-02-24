package schlingel.bplaced.net.generator.rest

import java.util.List
import java.util.ArrayList

class RestConfig {
	private String packageName;
	private String packageImport;
	private String url;
	private List<RestConfigItem> configs = new ArrayList<RestConfigItem>();

	def public String getPackageName() {
		packageName;
	}

	def public String getUrl() {
		url;
	}
	
	def public String getPackageImport() {
		packageImport;
	}
	
	def public List<RestConfigItem> getConfigs() {
		return configs;
	}
	
	def public RestConfigItem getConfig(String name) {
		return configs.findFirst[it.name.equals(name)]
	}
}
