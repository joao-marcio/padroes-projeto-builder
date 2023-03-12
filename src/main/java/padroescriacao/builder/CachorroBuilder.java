package padroescriacao.builder;

import java.util.Date;

public class CachorroBuilder {

    private Cachorro cachorro;

    public CachorroBuilder() {
        cachorro = new Cachorro();
    }

    public Cachorro build() {

        if (cachorro.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (cachorro.getIdade()<= 0){
            throw new IllegalArgumentException("Idade inválida");
        }

        if (cachorro.getRaca().equals("")) {
            throw new IllegalArgumentException("Raça inválida");
        }

        if (cachorro.getPorte().equals("")) {
            throw new IllegalArgumentException("Porte inválido");
        }

        if (cachorro.getCor().equals("")) {
            throw new IllegalArgumentException("Cor inválida");
        }

        return cachorro;
    }

    public CachorroBuilder setIdade(int idade) {
        cachorro.setIdade(idade);
        return this;
    }

    public CachorroBuilder setNome(String nome) {
        cachorro.setNome(nome);
        return this;
    }


    public CachorroBuilder setRaca(String raca) {
        cachorro.setRaca(raca);
        return this;
    }



    public CachorroBuilder setPorte(String porte) {
        cachorro.setPorte(porte);
        return this;
    }

    public CachorroBuilder setCor(String cor) {
        cachorro.setCor(cor);
        return this;
    }














}
