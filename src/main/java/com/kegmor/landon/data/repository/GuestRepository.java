package com.kegmor.landon.data.repository;

import com.kegmor.landon.data.entity.Guest;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {
}
