package com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.domain.usecase;


import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.domain.entity.SearchResponse;
import com.example.brauliomendez.cleanarquitecturedaggerandgithubapi.domain.repository.GithubSearchRepository;

import io.reactivex.Observable;

/**
 * Created by Leo on 24/01/17.
 */

public class SearchRepositoriesUseCase {

  private GithubSearchRepository githubSearchRepository;

  public SearchRepositoriesUseCase(
      GithubSearchRepository githubSearchRepository) {
    this.githubSearchRepository = githubSearchRepository;
  }

  public Observable<SearchResponse> getGithubRepositories(String username){
    return githubSearchRepository.searchGithubRepositories(username);
  }
}
