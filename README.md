# Padrao-Mediator

1) A classe Componente tem um atributo "mediador" que representa a referência ao objeto mediador ao qual o componente está registrado.
2) A classe ExemploClasse é um exemplo genérico de uma classe componente que pode se registrar no mediador.
3) A classe ExemploOuvinte é um exemplo genérico de uma classe que implementa a interface OuvinteEvento e recebe eventos do mediador.
4) A classe MediadorEventos atua como o mediador central que coordena a comunicação entre os componentes e os ouvintes. Os detalhes específicos dos métodos do mediador foram omitidos neste diagrama simplificado.
5) A interface OuvinteEvento define os métodos que os ouvintes devem implementar para receber e lidar com eventos.
