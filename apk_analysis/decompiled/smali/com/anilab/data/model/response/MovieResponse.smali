.class public final Lcom/anilab/data/model/response/MovieResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lo7/l;
    generateAdapter = true
.end annotation


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/Integer;

.field public final j:Ljava/lang/Integer;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/Integer;

.field public final m:Ljava/lang/Integer;

.field public final n:Ljava/lang/Integer;

.field public final o:Ljava/lang/Double;

.field public final p:Ljava/lang/Long;

.field public final q:Ljava/util/List;

.field public final r:Ljava/lang/Integer;

.field public final s:Ljava/lang/String;

.field public final t:Ljava/lang/String;

.field public final u:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0
    .param p1    # J
        .annotation runtime Lo7/i;
            name = "id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name_english"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name_synonyms"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name_japanese"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "overview"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "poster_url"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "premiered_season"
        .end annotation
    .end param
    .param p10    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "premiered_year"
        .end annotation
    .end param
    .param p11    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "type"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "slug_english"
        .end annotation
    .end param
    .param p13    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "total_episodes"
        .end annotation
    .end param
    .param p14    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "latest_episode"
        .end annotation
    .end param
    .param p15    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "has_dub"
        .end annotation
    .end param
    .param p16    # Ljava/lang/Double;
        .annotation runtime Lo7/i;
            name = "mal_score"
        .end annotation
    .end param
    .param p17    # Ljava/lang/Long;
        .annotation runtime Lo7/i;
            name = "update_at"
        .end annotation
    .end param
    .param p18    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "genres"
        .end annotation
    .end param
    .param p19    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "in_watch_list"
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "rating_type"
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "quality"
        .end annotation
    .end param
    .param p22    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "is_pin"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Double;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Lcom/anilab/data/model/response/GenreResponse;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/anilab/data/model/response/MovieResponse;->a:J

    .line 3
    iput-object p3, p0, Lcom/anilab/data/model/response/MovieResponse;->b:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/anilab/data/model/response/MovieResponse;->c:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lcom/anilab/data/model/response/MovieResponse;->d:Ljava/lang/String;

    .line 6
    iput-object p6, p0, Lcom/anilab/data/model/response/MovieResponse;->e:Ljava/lang/String;

    .line 7
    iput-object p7, p0, Lcom/anilab/data/model/response/MovieResponse;->f:Ljava/lang/String;

    .line 8
    iput-object p8, p0, Lcom/anilab/data/model/response/MovieResponse;->g:Ljava/lang/String;

    .line 9
    iput-object p9, p0, Lcom/anilab/data/model/response/MovieResponse;->h:Ljava/lang/String;

    .line 10
    iput-object p10, p0, Lcom/anilab/data/model/response/MovieResponse;->i:Ljava/lang/Integer;

    .line 11
    iput-object p11, p0, Lcom/anilab/data/model/response/MovieResponse;->j:Ljava/lang/Integer;

    .line 12
    iput-object p12, p0, Lcom/anilab/data/model/response/MovieResponse;->k:Ljava/lang/String;

    .line 13
    iput-object p13, p0, Lcom/anilab/data/model/response/MovieResponse;->l:Ljava/lang/Integer;

    .line 14
    iput-object p14, p0, Lcom/anilab/data/model/response/MovieResponse;->m:Ljava/lang/Integer;

    .line 15
    iput-object p15, p0, Lcom/anilab/data/model/response/MovieResponse;->n:Ljava/lang/Integer;

    move-object/from16 p1, p16

    .line 16
    iput-object p1, p0, Lcom/anilab/data/model/response/MovieResponse;->o:Ljava/lang/Double;

    move-object/from16 p1, p17

    .line 17
    iput-object p1, p0, Lcom/anilab/data/model/response/MovieResponse;->p:Ljava/lang/Long;

    move-object/from16 p1, p18

    .line 18
    iput-object p1, p0, Lcom/anilab/data/model/response/MovieResponse;->q:Ljava/util/List;

    move-object/from16 p1, p19

    .line 19
    iput-object p1, p0, Lcom/anilab/data/model/response/MovieResponse;->r:Ljava/lang/Integer;

    move-object/from16 p1, p20

    .line 20
    iput-object p1, p0, Lcom/anilab/data/model/response/MovieResponse;->s:Ljava/lang/String;

    move-object/from16 p1, p21

    .line 21
    iput-object p1, p0, Lcom/anilab/data/model/response/MovieResponse;->t:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 22
    iput-object p1, p0, Lcom/anilab/data/model/response/MovieResponse;->u:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 25

    const/high16 v0, 0x20000

    and-int v0, p23, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object/from16 v21, v1

    goto :goto_0

    :cond_0
    move-object/from16 v21, p19

    :goto_0
    const/high16 v0, 0x40000

    and-int v0, p23, v0

    if-eqz v0, :cond_1

    move-object/from16 v22, v1

    goto :goto_1

    :cond_1
    move-object/from16 v22, p20

    :goto_1
    const/high16 v0, 0x80000

    and-int v0, p23, v0

    if-eqz v0, :cond_2

    move-object/from16 v23, v1

    goto :goto_2

    :cond_2
    move-object/from16 v23, p21

    :goto_2
    const/high16 v0, 0x100000

    and-int v0, p23, v0

    if-eqz v0, :cond_3

    move-object/from16 v24, v1

    :goto_3
    move-object/from16 v2, p0

    move-wide/from16 v3, p1

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-object/from16 v17, p15

    move-object/from16 v18, p16

    move-object/from16 v19, p17

    move-object/from16 v20, p18

    goto :goto_4

    :cond_3
    move-object/from16 v24, p22

    goto :goto_3

    .line 23
    :goto_4
    invoke-direct/range {v2 .. v24}, Lcom/anilab/data/model/response/MovieResponse;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method


# virtual methods
.method public final copy(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/anilab/data/model/response/MovieResponse;
    .locals 23
    .param p1    # J
        .annotation runtime Lo7/i;
            name = "id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name_english"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name_synonyms"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "name_japanese"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "overview"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "poster_url"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "premiered_season"
        .end annotation
    .end param
    .param p10    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "premiered_year"
        .end annotation
    .end param
    .param p11    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "type"
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "slug_english"
        .end annotation
    .end param
    .param p13    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "total_episodes"
        .end annotation
    .end param
    .param p14    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "latest_episode"
        .end annotation
    .end param
    .param p15    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "has_dub"
        .end annotation
    .end param
    .param p16    # Ljava/lang/Double;
        .annotation runtime Lo7/i;
            name = "mal_score"
        .end annotation
    .end param
    .param p17    # Ljava/lang/Long;
        .annotation runtime Lo7/i;
            name = "update_at"
        .end annotation
    .end param
    .param p18    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "genres"
        .end annotation
    .end param
    .param p19    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "in_watch_list"
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "rating_type"
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation runtime Lo7/i;
            name = "quality"
        .end annotation
    .end param
    .param p22    # Ljava/lang/Integer;
        .annotation runtime Lo7/i;
            name = "is_pin"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Double;",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Lcom/anilab/data/model/response/GenreResponse;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/anilab/data/model/response/MovieResponse;"
        }
    .end annotation

    new-instance v0, Lcom/anilab/data/model/response/MovieResponse;

    move-wide/from16 v1, p1

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

    invoke-direct/range {v0 .. v22}, Lcom/anilab/data/model/response/MovieResponse;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/anilab/data/model/response/MovieResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/anilab/data/model/response/MovieResponse;

    iget-wide v3, p1, Lcom/anilab/data/model/response/MovieResponse;->a:J

    iget-wide v5, p0, Lcom/anilab/data/model/response/MovieResponse;->a:J

    cmp-long v1, v5, v3

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->i:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->i:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->j:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->j:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->k:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->k:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->l:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->l:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->m:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->m:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->n:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->n:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->o:Ljava/lang/Double;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->o:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->p:Ljava/lang/Long;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->p:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->q:Ljava/util/List;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->q:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->r:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->r:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->s:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->s:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->t:Ljava/lang/String;

    iget-object v3, p1, Lcom/anilab/data/model/response/MovieResponse;->t:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->u:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/anilab/data/model/response/MovieResponse;->u:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    return v2

    :cond_16
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/anilab/data/model/response/MovieResponse;->a:J

    .line 4
    .line 5
    ushr-long v3, v1, v0

    .line 6
    .line 7
    xor-long/2addr v1, v3

    .line 8
    long-to-int v0, v1

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->b:Ljava/lang/String;

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    move v2, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    :goto_0
    add-int/2addr v0, v2

    .line 23
    mul-int/lit8 v0, v0, 0x1f

    .line 24
    .line 25
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->c:Ljava/lang/String;

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    move v2, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    :goto_1
    add-int/2addr v0, v2

    .line 36
    mul-int/lit8 v0, v0, 0x1f

    .line 37
    .line 38
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->d:Ljava/lang/String;

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    move v2, v1

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    :goto_2
    add-int/2addr v0, v2

    .line 49
    mul-int/lit8 v0, v0, 0x1f

    .line 50
    .line 51
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->e:Ljava/lang/String;

    .line 52
    .line 53
    if-nez v2, :cond_3

    .line 54
    .line 55
    move v2, v1

    .line 56
    goto :goto_3

    .line 57
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    :goto_3
    add-int/2addr v0, v2

    .line 62
    mul-int/lit8 v0, v0, 0x1f

    .line 63
    .line 64
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->f:Ljava/lang/String;

    .line 65
    .line 66
    if-nez v2, :cond_4

    .line 67
    .line 68
    move v2, v1

    .line 69
    goto :goto_4

    .line 70
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    :goto_4
    add-int/2addr v0, v2

    .line 75
    mul-int/lit8 v0, v0, 0x1f

    .line 76
    .line 77
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->g:Ljava/lang/String;

    .line 78
    .line 79
    if-nez v2, :cond_5

    .line 80
    .line 81
    move v2, v1

    .line 82
    goto :goto_5

    .line 83
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    :goto_5
    add-int/2addr v0, v2

    .line 88
    mul-int/lit8 v0, v0, 0x1f

    .line 89
    .line 90
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->h:Ljava/lang/String;

    .line 91
    .line 92
    if-nez v2, :cond_6

    .line 93
    .line 94
    move v2, v1

    .line 95
    goto :goto_6

    .line 96
    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    :goto_6
    add-int/2addr v0, v2

    .line 101
    mul-int/lit8 v0, v0, 0x1f

    .line 102
    .line 103
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->i:Ljava/lang/Integer;

    .line 104
    .line 105
    if-nez v2, :cond_7

    .line 106
    .line 107
    move v2, v1

    .line 108
    goto :goto_7

    .line 109
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    :goto_7
    add-int/2addr v0, v2

    .line 114
    mul-int/lit8 v0, v0, 0x1f

    .line 115
    .line 116
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->j:Ljava/lang/Integer;

    .line 117
    .line 118
    if-nez v2, :cond_8

    .line 119
    .line 120
    move v2, v1

    .line 121
    goto :goto_8

    .line 122
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    :goto_8
    add-int/2addr v0, v2

    .line 127
    mul-int/lit8 v0, v0, 0x1f

    .line 128
    .line 129
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->k:Ljava/lang/String;

    .line 130
    .line 131
    if-nez v2, :cond_9

    .line 132
    .line 133
    move v2, v1

    .line 134
    goto :goto_9

    .line 135
    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    :goto_9
    add-int/2addr v0, v2

    .line 140
    mul-int/lit8 v0, v0, 0x1f

    .line 141
    .line 142
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->l:Ljava/lang/Integer;

    .line 143
    .line 144
    if-nez v2, :cond_a

    .line 145
    .line 146
    move v2, v1

    .line 147
    goto :goto_a

    .line 148
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    :goto_a
    add-int/2addr v0, v2

    .line 153
    mul-int/lit8 v0, v0, 0x1f

    .line 154
    .line 155
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->m:Ljava/lang/Integer;

    .line 156
    .line 157
    if-nez v2, :cond_b

    .line 158
    .line 159
    move v2, v1

    .line 160
    goto :goto_b

    .line 161
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    :goto_b
    add-int/2addr v0, v2

    .line 166
    mul-int/lit8 v0, v0, 0x1f

    .line 167
    .line 168
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->n:Ljava/lang/Integer;

    .line 169
    .line 170
    if-nez v2, :cond_c

    .line 171
    .line 172
    move v2, v1

    .line 173
    goto :goto_c

    .line 174
    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    :goto_c
    add-int/2addr v0, v2

    .line 179
    mul-int/lit8 v0, v0, 0x1f

    .line 180
    .line 181
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->o:Ljava/lang/Double;

    .line 182
    .line 183
    if-nez v2, :cond_d

    .line 184
    .line 185
    move v2, v1

    .line 186
    goto :goto_d

    .line 187
    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    :goto_d
    add-int/2addr v0, v2

    .line 192
    mul-int/lit8 v0, v0, 0x1f

    .line 193
    .line 194
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->p:Ljava/lang/Long;

    .line 195
    .line 196
    if-nez v2, :cond_e

    .line 197
    .line 198
    move v2, v1

    .line 199
    goto :goto_e

    .line 200
    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    :goto_e
    add-int/2addr v0, v2

    .line 205
    mul-int/lit8 v0, v0, 0x1f

    .line 206
    .line 207
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->q:Ljava/util/List;

    .line 208
    .line 209
    if-nez v2, :cond_f

    .line 210
    .line 211
    move v2, v1

    .line 212
    goto :goto_f

    .line 213
    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    :goto_f
    add-int/2addr v0, v2

    .line 218
    mul-int/lit8 v0, v0, 0x1f

    .line 219
    .line 220
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->r:Ljava/lang/Integer;

    .line 221
    .line 222
    if-nez v2, :cond_10

    .line 223
    .line 224
    move v2, v1

    .line 225
    goto :goto_10

    .line 226
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    :goto_10
    add-int/2addr v0, v2

    .line 231
    mul-int/lit8 v0, v0, 0x1f

    .line 232
    .line 233
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->s:Ljava/lang/String;

    .line 234
    .line 235
    if-nez v2, :cond_11

    .line 236
    .line 237
    move v2, v1

    .line 238
    goto :goto_11

    .line 239
    :cond_11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    :goto_11
    add-int/2addr v0, v2

    .line 244
    mul-int/lit8 v0, v0, 0x1f

    .line 245
    .line 246
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->t:Ljava/lang/String;

    .line 247
    .line 248
    if-nez v2, :cond_12

    .line 249
    .line 250
    move v2, v1

    .line 251
    goto :goto_12

    .line 252
    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    :goto_12
    add-int/2addr v0, v2

    .line 257
    mul-int/lit8 v0, v0, 0x1f

    .line 258
    .line 259
    iget-object v2, p0, Lcom/anilab/data/model/response/MovieResponse;->u:Ljava/lang/Integer;

    .line 260
    .line 261
    if-nez v2, :cond_13

    .line 262
    .line 263
    goto :goto_13

    .line 264
    :cond_13
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    :goto_13
    add-int/2addr v0, v1

    .line 269
    return v0
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MovieResponse(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/anilab/data/model/response/MovieResponse;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nameSynonyms="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nameJapanese="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", overview="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", posterPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", numberSeason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", year="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->i:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->j:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", slug="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", numberEpisode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->l:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", latestEpisode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->m:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hasDub="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->n:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->o:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", updateAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->p:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", genres="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->q:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inWatchList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->r:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ratingType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", quality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isPin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MovieResponse;->u:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
