package backend.models;

public class IncidentModels {

    public enum IncidentStatus { 
        INVESTIGATING, MITIGATING, MONITORING, RESOLVED 
    }

    public enum Severity { 
        SEV1, SEV2, SEV3, SEV4 
    }

    public record ServiceRef(String id, String name) {}

    public record IncidentId(String value) {}
    public record EventId(String value) {}
    public record UserId(String value) {}
}
