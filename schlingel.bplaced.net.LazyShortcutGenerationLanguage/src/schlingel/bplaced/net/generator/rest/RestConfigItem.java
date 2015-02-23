package schlingel.bplaced.net.generator.rest;

public class RestConfigItem {
	private String packageImport;
	private String packageName;
	private String url;
	
	public String getPackageImport() {
		return packageImport;
	}
	public void setPackageImport(String packageImport) {
		this.packageImport = packageImport;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
