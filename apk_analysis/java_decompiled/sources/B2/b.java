package B2;

import A7.n;
import B8.o;
import B8.p;
import B8.t;
import B8.y;
import com.anilab.data.model.request.ChangePasswordRequest;
import com.anilab.data.model.request.CommentRequest;
import com.anilab.data.model.request.ContinueWatchRequest;
import com.anilab.data.model.request.CreateVoteRequest;
import com.anilab.data.model.request.DeleteCommentRequest;
import com.anilab.data.model.request.DeleteContinueWatchRequest;
import com.anilab.data.model.request.DeleteVoteCommentRequest;
import com.anilab.data.model.request.LoginRequest;
import com.anilab.data.model.request.LoginWithGoogleRequest;
import com.anilab.data.model.request.LogoutRequest;
import com.anilab.data.model.request.MovieIdRequest;
import com.anilab.data.model.request.MoviePinRequest;
import com.anilab.data.model.request.RegisterRequest;
import com.anilab.data.model.request.ReplyCommentRequest;
import com.anilab.data.model.request.SyncMalRequest;
import com.anilab.data.model.request.SyncRequest;
import com.anilab.data.model.request.UpdateUserInfoRequest;
import com.anilab.data.model.request.VoteRequest;
import com.anilab.data.model.response.AllSettingsResponse;
import com.anilab.data.model.response.ApiResponse;
import com.anilab.data.model.response.AvatarListResponse;
import com.anilab.data.model.response.CommentInfoResponse;
import com.anilab.data.model.response.CommentListResponse;
import com.anilab.data.model.response.CommentResponse;
import com.anilab.data.model.response.ContinueWatchRowResponse;
import com.anilab.data.model.response.EpisodeDetailResponse;
import com.anilab.data.model.response.HomeResponse;
import com.anilab.data.model.response.ListEpisodeResponse;
import com.anilab.data.model.response.ListGenreResponse;
import com.anilab.data.model.response.LoginResponse;
import com.anilab.data.model.response.MalIdsResponse;
import com.anilab.data.model.response.MovieResponse;
import com.anilab.data.model.response.MovieVoteResponse;
import com.anilab.data.model.response.PageDataResponse;
import com.anilab.data.model.response.RelatedMovieResponse;
import com.anilab.data.model.response.ReplyCommentsResponse;
import com.anilab.data.model.response.ScheduleResponse;
import com.anilab.data.model.response.SyncMalResponse;
import com.anilab.data.model.response.UserInfoResponse;
import com.anilab.data.model.response.WatchListIdResponse;
import java.util.List;
import z8.O;

/* loaded from: classes.dex */
public interface b {
    @B8.k({"IncludeAuthorization: true"})
    @o
    Object A(@y String str, @B8.a VoteRequest voteRequest, E7.d<? super ApiResponse<Object>> dVar);

    @o
    Object B(@y String str, @B8.a RegisterRequest registerRequest, E7.d<? super ApiResponse<LoginResponse>> dVar);

    @B8.f
    Object C(@y String str, @t(encoded = true, value = "genres[]") List<Long> list, @t("page") int i9, @t("limit") int i10, E7.d<? super ApiResponse<PageDataResponse<MovieResponse>>> dVar);

    @B8.f
    Object D(@y String str, E7.d<? super ApiResponse<AllSettingsResponse>> dVar);

    @B8.h(hasBody = W.g.f7848s, method = "DELETE")
    @B8.k({"IncludeAuthorization: true"})
    Object E(@y String str, @B8.a DeleteVoteCommentRequest deleteVoteCommentRequest, E7.d<? super ApiResponse<Object>> dVar);

    @o
    Object F(@y String str, @B8.a LogoutRequest logoutRequest, E7.d<? super O<n>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @B8.f
    Object G(@y String str, @t("page") int i9, @t("limit") int i10, E7.d<? super ApiResponse<PageDataResponse<MovieResponse>>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @o
    Object H(@y String str, @B8.a MoviePinRequest moviePinRequest, E7.d<? super n> dVar);

    @B8.f
    Object I(@y String str, E7.d<? super ApiResponse<AvatarListResponse>> dVar);

    @B8.f
    Object J(@y String str, @t("page") int i9, @t("keyword") String str2, @t("limit") int i10, E7.d<? super ApiResponse<PageDataResponse<MovieResponse>>> dVar);

    @B8.f
    Object K(@y String str, @t("start") long j, @t("end") long j4, E7.d<? super ApiResponse<ScheduleResponse>> dVar);

    @B8.f
    Object L(@y String str, @t("list_id") String str2, @t("page") int i9, @t("limit") int i10, E7.d<? super ApiResponse<PageDataResponse<MovieResponse>>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @B8.f
    Object M(@y String str, @t("movie_id") long j, @t("page") int i9, @t("limit") int i10, E7.d<? super ApiResponse<CommentListResponse>> dVar);

    @B8.f
    Object N(@y String str, @t("page") int i9, @t("type") Integer num, @t("status") Integer num2, @t("order") String str2, @t("genres[]") List<Long> list, @t("limit") int i10, E7.d<? super ApiResponse<PageDataResponse<MovieResponse>>> dVar);

    @B8.h(hasBody = W.g.f7848s, method = "DELETE")
    @B8.k({"IncludeAuthorization: true"})
    Object O(@y String str, @B8.a DeleteContinueWatchRequest deleteContinueWatchRequest, E7.d<? super O<n>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @o
    Object P(@y String str, @B8.a MovieIdRequest movieIdRequest, E7.d<? super ApiResponse<Object>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @B8.f
    Object Q(@y String str, @t("page") int i9, @t("limit") int i10, E7.d<? super ApiResponse<PageDataResponse<ContinueWatchRowResponse>>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @B8.f
    Object a(@y String str, E7.d<? super ApiResponse<List<HomeResponse>>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @B8.f
    Object b(@y String str, E7.d<? super ApiResponse<MalIdsResponse>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @o
    Object c(@y String str, @B8.a ReplyCommentRequest replyCommentRequest, E7.d<? super ApiResponse<CommentResponse>> dVar);

    @o
    Object d(@y String str, @B8.a LoginRequest loginRequest, E7.d<? super ApiResponse<LoginResponse>> dVar);

    @B8.k({"IncludeOptional: true"})
    @B8.f
    Object e(@y String str, @t("id") long j, E7.d<? super ApiResponse<EpisodeDetailResponse>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @o
    Object f(@y String str, @B8.a ContinueWatchRequest continueWatchRequest, E7.d<? super n> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @o
    Object g(@y String str, @B8.a SyncRequest syncRequest, E7.d<? super O<n>> dVar);

    @B8.f
    Object h(@y String str, @t("commentId") String str2, E7.d<? super ApiResponse<CommentInfoResponse>> dVar);

    @o
    Object i(@y String str, @B8.a SyncRequest syncRequest, E7.d<? super O<n>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @o
    Object j(@y String str, @B8.a SyncMalRequest syncMalRequest, E7.d<? super ApiResponse<SyncMalResponse>> dVar);

    @o
    Object k(@y String str, @B8.a LoginWithGoogleRequest loginWithGoogleRequest, E7.d<? super ApiResponse<LoginResponse>> dVar);

    @p
    @B8.k({"IncludeAuthorization: true"})
    Object l(@y String str, @B8.a ChangePasswordRequest changePasswordRequest, E7.d<? super O<n>> dVar);

    @p
    @B8.k({"IncludeAuthorization: true"})
    Object m(@y String str, @B8.a UpdateUserInfoRequest updateUserInfoRequest, E7.d<? super ApiResponse<UserInfoResponse>> dVar);

    @B8.h(hasBody = W.g.f7848s, method = "DELETE")
    @B8.k({"IncludeAuthorization: true"})
    Object n(@y String str, @B8.a DeleteCommentRequest deleteCommentRequest, E7.d<? super ApiResponse<Object>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @o
    Object o(@y String str, @B8.a CreateVoteRequest createVoteRequest, E7.d<? super ApiResponse<Object>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @B8.f
    Object p(@y String str, @t("parentId") String str2, E7.d<? super ApiResponse<ReplyCommentsResponse>> dVar);

    @B8.f
    Object q(@y String str, @t("movieId") long j, E7.d<? super ApiResponse<RelatedMovieResponse>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @o
    Object r(@y String str, @B8.a CommentRequest commentRequest, E7.d<? super ApiResponse<CommentResponse>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @B8.f
    Object s(@y String str, E7.d<? super ApiResponse<WatchListIdResponse>> dVar);

    @B8.f
    Object t(@y String str, @t("movie_id") long j, E7.d<? super ApiResponse<MovieVoteResponse>> dVar);

    @B8.f
    Object u(@y String str, E7.d<? super ApiResponse<ListGenreResponse>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @B8.f
    Object v(@y String str, @t("movieId") long j, E7.d<? super ApiResponse<ListEpisodeResponse>> dVar);

    @B8.f
    Object w(@y String str, @t("limit") int i9, E7.d<? super ApiResponse<PageDataResponse<MovieResponse>>> dVar);

    @B8.h(hasBody = W.g.f7848s, method = "DELETE")
    @B8.k({"IncludeAuthorization: true"})
    Object x(@y String str, @B8.a MovieIdRequest movieIdRequest, E7.d<? super ApiResponse<Object>> dVar);

    @B8.k({"IncludeAuthorization: true"})
    @B8.f
    Object y(@y String str, E7.d<? super ApiResponse<UserInfoResponse>> dVar);

    @B8.f
    Object z(@y String str, @t("id") long j, E7.d<? super ApiResponse<MovieResponse>> dVar);
}
