package android.kotlin.crud.app

import org.springframework.data.repository.CrudRepository

interface ItemRepository : CrudRepository<Movie, Long> {
}
