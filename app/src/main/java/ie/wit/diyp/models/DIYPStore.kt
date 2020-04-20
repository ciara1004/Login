package ie.wit.diyp.models

interface DIYPStore{
    fun findAll() : List<DIYPModel>
    fun findById (id: Long) : DIYPModel?
    fun create(order: DIYPModel)
}