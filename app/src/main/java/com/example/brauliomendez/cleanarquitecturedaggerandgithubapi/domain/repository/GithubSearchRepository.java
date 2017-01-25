package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.domain.repository;


import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.domain.entity.SearchResponse;

import io.reactivex.Observable;

/**
 * Created by Leo on 24/01/17.
 */

public interface GithubSearchRepository {
  Observable<SearchResponse> searchGithubRepositories(String username);
}
