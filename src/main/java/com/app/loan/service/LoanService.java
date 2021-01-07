package com.app.loan.service;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import com.app.loan.model.Client;
import com.app.loan.model.ClientResponse;
import com.app.loan.model.Modality;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    private final List<Modality> modalities = new ArrayList<>();

    public ClientResponse checkClient(Client client){
        CPFValidator validator = new CPFValidator();

        try {
            validator.assertValid(client.getCpf());

            if(modalities.size() > 0) modalities.clear();

            modalities.add(new Modality("Pessoal", 4));
            checkConsignado(client);

            if(client.getSalary() >= 5000){
                modalities.add(new Modality("Consignado", 2));
            }
            return new ClientResponse(client.getName(), modalities);
        } catch (InvalidStateException e){
            throw new IllegalArgumentException("CPF invalid!");
        }
    }

    private void checkConsignado(Client client){
        if(client.getSalary() <= 3000 && client.getAge() < 30 && client.getUf().equalsIgnoreCase("ce")){
            modalities.add(new Modality("Com Garantia", 3));
        }
        else if((client.getSalary() > 3000 && client.getSalary() < 5000) && client.getUf().equalsIgnoreCase("ce")){
            modalities.add(new Modality("Com Garantia", 3));
        }
        else if(client.getSalary() >= 5000 && client.getAge() < 30){
            modalities.add(new Modality("Com Garantia", 3));
        }
    }
}
