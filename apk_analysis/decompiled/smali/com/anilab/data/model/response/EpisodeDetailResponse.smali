.class public final Lcom/anilab/data/model/response/EpisodeDetailResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lo7/l;
    generateAdapter = true
.end annotation


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:Ljava/lang/Long;

.field public final c:Ljava/lang/Long;

.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/Integer;

.field public final m:Ljava/lang/Integer;

.field public final n:Ljava/lang/Long;

.field public final o:Ljava/lang/Long;

.field public final p:Lcom/anilab/data/model/response/StreamingResponse;

.field public final q:Ljava/util/List;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Ljava/util/List;

.field public final u:Ljava/util/List;

.field public final v:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/anilab/data/model/response/StreamingResponse;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Lo7/i;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation runtime Lo7/i;
            name = "movie_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Long;
        .annotation runtime Lo7/i;
            name = "movie_mal_id"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "number"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name_english"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name_japanese"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "slug"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "slug_english"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "overview"
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "aired"
        .end annotation
    .end param
    .param p12    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "is_filler"
        .end annotation
    .end param
    .param p13    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "publish"
        .end annotation
    .end param
    .param p14    # Ljava/lang/Long;
        .annotation runtime Lo7/i;
            name = "created_at"
        .end annotation
    .end param
    .param p15    # Ljava/lang/Long;
        .annotation runtime Lo7/i;
            name = "updated_at"
        .end annotation
    .end param
    .param p16    # Lcom/anilab/data/model/response/StreamingResponse;
        .annotation runtime Lo7/i;
            name = "dataStream"
        .end annotation
    .end param
    .param p17    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "subs"
        .end annotation
    .end param
    .param p18    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "headers"
        .end annotation
    .end param
    .param p19    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "sub_intro"
        .end annotation
    .end param
    .param p20    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "sub_outro"
        .end annotation
    .end param
    .param p21    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "dub_intro"
        .end annotation
    .end param
    .param p22    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "dub_outro"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Lcom/anilab/data/model/response/StreamingResponse;",
            "Ljava/util/List<",
            "Lcom/anilab/data/model/response/SubResponse;",
            ">;",
            "Ljava/util/List<",
            "Lcom/anilab/data/model/response/StreamHeadersResponse;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->a:Ljava/lang/Long;

    .line 3
    iput-object p2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->b:Ljava/lang/Long;

    .line 4
    iput-object p3, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->c:Ljava/lang/Long;

    .line 5
    iput-object p4, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->d:Ljava/lang/Integer;

    .line 6
    iput-object p5, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->e:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->f:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->g:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->h:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->i:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->j:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->k:Ljava/lang/String;

    .line 13
    iput-object p12, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->l:Ljava/lang/Integer;

    .line 14
    iput-object p13, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->m:Ljava/lang/Integer;

    .line 15
    iput-object p14, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->n:Ljava/lang/Long;

    .line 16
    iput-object p15, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->o:Ljava/lang/Long;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->p:Lcom/anilab/data/model/response/StreamingResponse;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->q:Ljava/util/List;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->r:Ljava/util/List;

    move-object/from16 p1, p19

    .line 20
    iput-object p1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->s:Ljava/util/List;

    move-object/from16 p1, p20

    .line 21
    iput-object p1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->t:Ljava/util/List;

    move-object/from16 p1, p21

    .line 22
    iput-object p1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->u:Ljava/util/List;

    move-object/from16 p1, p22

    .line 23
    iput-object p1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->v:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final copy(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/anilab/data/model/response/StreamingResponse;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/anilab/data/model/response/EpisodeDetailResponse;
    .locals 23
    .param p1    # Ljava/lang/Long;
        .annotation runtime Lo7/i;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation runtime Lo7/i;
            name = "movie_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/Long;
        .annotation runtime Lo7/i;
            name = "movie_mal_id"
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "number"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name_english"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name_japanese"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "slug"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "slug_english"
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "overview"
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "aired"
        .end annotation
    .end param
    .param p12    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "is_filler"
        .end annotation
    .end param
    .param p13    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "publish"
        .end annotation
    .end param
    .param p14    # Ljava/lang/Long;
        .annotation runtime Lo7/i;
            name = "created_at"
        .end annotation
    .end param
    .param p15    # Ljava/lang/Long;
        .annotation runtime Lo7/i;
            name = "updated_at"
        .end annotation
    .end param
    .param p16    # Lcom/anilab/data/model/response/StreamingResponse;
        .annotation runtime Lo7/i;
            name = "dataStream"
        .end annotation
    .end param
    .param p17    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "subs"
        .end annotation
    .end param
    .param p18    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "headers"
        .end annotation
    .end param
    .param p19    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "sub_intro"
        .end annotation
    .end param
    .param p20    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "sub_outro"
        .end annotation
    .end param
    .param p21    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "dub_intro"
        .end annotation
    .end param
    .param p22    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "dub_outro"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Lcom/anilab/data/model/response/StreamingResponse;",
            "Ljava/util/List<",
            "Lcom/anilab/data/model/response/SubResponse;",
            ">;",
            "Ljava/util/List<",
            "Lcom/anilab/data/model/response/StreamHeadersResponse;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/anilab/data/model/response/EpisodeDetailResponse;"
        }
    .end annotation

    new-instance v0, Lcom/anilab/data/model/response/EpisodeDetailResponse;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    invoke-direct/range {v0 .. v22}, Lcom/anilab/data/model/response/EpisodeDetailResponse;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/anilab/data/model/response/StreamingResponse;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;

    iget-object v1, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->a:Ljava/lang/Long;

    iget-object v3, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->a:Ljava/lang/Long;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->b:Ljava/lang/Long;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->b:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->c:Ljava/lang/Long;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->c:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->d:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->d:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->i:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->j:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->j:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->k:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->k:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->l:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->l:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->m:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->m:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->n:Ljava/lang/Long;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->n:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->o:Ljava/lang/Long;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->o:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->p:Lcom/anilab/data/model/response/StreamingResponse;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->p:Lcom/anilab/data/model/response/StreamingResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->q:Ljava/util/List;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->q:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->r:Ljava/util/List;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->r:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->s:Ljava/util/List;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->s:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->t:Ljava/util/List;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->t:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->u:Ljava/util/List;

    iget-object v3, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->u:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->v:Ljava/util/List;

    iget-object p1, p1, Lcom/anilab/data/model/response/EpisodeDetailResponse;->v:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    return v2

    :cond_17
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->a:Ljava/lang/Long;

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->b:Ljava/lang/Long;

    if-nez v2, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->c:Ljava/lang/Long;

    if-nez v2, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->d:Ljava/lang/Integer;

    if-nez v2, :cond_3

    move v2, v0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->e:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->f:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->g:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v0

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->h:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v0

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->i:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v0

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->j:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v0

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->k:Ljava/lang/String;

    if-nez v2, :cond_a

    move v2, v0

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->l:Ljava/lang/Integer;

    if-nez v2, :cond_b

    move v2, v0

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->m:Ljava/lang/Integer;

    if-nez v2, :cond_c

    move v2, v0

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->n:Ljava/lang/Long;

    if-nez v2, :cond_d

    move v2, v0

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->o:Ljava/lang/Long;

    if-nez v2, :cond_e

    move v2, v0

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->p:Lcom/anilab/data/model/response/StreamingResponse;

    if-nez v2, :cond_f

    move v2, v0

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Lcom/anilab/data/model/response/StreamingResponse;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->q:Ljava/util/List;

    if-nez v2, :cond_10

    move v2, v0

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->r:Ljava/util/List;

    if-nez v2, :cond_11

    move v2, v0

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->s:Ljava/util/List;

    if-nez v2, :cond_12

    move v2, v0

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_12
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->t:Ljava/util/List;

    if-nez v2, :cond_13

    move v2, v0

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_13
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->u:Ljava/util/List;

    if-nez v2, :cond_14

    move v2, v0

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_14
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->v:Ljava/util/List;

    if-nez v2, :cond_15

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_15
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EpisodeDetailResponse(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->a:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", movieId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->b:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", movieMalId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->c:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->d:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nameEnglish="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nameJapanese="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", slug="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", slugEnglish="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", overview="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", aired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isFiller="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->l:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", publish="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->m:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->n:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->o:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", streaming="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->p:Lcom/anilab/data/model/response/StreamingResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->q:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", headers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->r:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subIntro="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->s:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subOutro="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->t:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dubIntro="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->u:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dubOutro="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/EpisodeDetailResponse;->v:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
