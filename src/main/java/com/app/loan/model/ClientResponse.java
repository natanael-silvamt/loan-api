package com.app.loan.model;

import java.util.List;

public class ClientResponse {
    private String client;
    private List<Modality> modalities;

    public ClientResponse(String client, List<Modality> modalities) {
        this.client = client;
        this.modalities = modalities;
    }

    public ClientResponse() {}

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public List<Modality> getModalities() {
        return modalities;
    }

    public void setModalities(List<Modality> modalities) {
        this.modalities = modalities;
    }

    @Override
    public String toString() {
        return "ClientResponse{" +
                "client='" + client + '\'' +
                ", modalities=" + modalities +
                '}';
    }
}
