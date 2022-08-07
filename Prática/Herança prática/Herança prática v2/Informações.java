public class Informações {
    String iNome, iRua, iTipCargo;
    int iCep, iTel;

    public Informações(String _nome, String _rua, int _cep, int _tel, String _tipCargo) {
        this.iNome = _nome;
        this.iRua = _rua;
        this.iCep = _cep;
        this.iTel = _tel;

        if(_tipCargo.toLowerCase().equals("g")) {
            this.iTipCargo = "Gerente";
        }
        else if (_tipCargo.toLowerCase().equals("e")) {
            this.iTipCargo = "Equipe";
        }
        else if (_tipCargo.toLowerCase().equals("r")){
            this.iTipCargo = "Recursos Humanos";
        }
    }
}
