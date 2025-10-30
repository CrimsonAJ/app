.class public final LG2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# instance fields
.field public final a:LG2/l;


# direct methods
.method public constructor <init>(LG2/l;)V
    .locals 1

    .line 1
    const-string v0, "filterConfigMapper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LG2/r;->a:LG2/l;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final a(Lcom/anilab/data/model/response/MovieConfigResponse;)LH2/q;
    .locals 5

    .line 1
    const-string v0, "dto"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LH2/q;

    .line 7
    .line 8
    iget-object v1, p0, LG2/r;->a:LG2/l;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v2, p1, Lcom/anilab/data/model/response/MovieConfigResponse;->a:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {v1, v2}, Ll6/b;->q(LG2/q;Ljava/util/List;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p1, Lcom/anilab/data/model/response/MovieConfigResponse;->b:Ljava/util/List;

    .line 20
    .line 21
    invoke-static {v1, v3}, Ll6/b;->q(LG2/q;Ljava/util/List;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v4, p1, Lcom/anilab/data/model/response/MovieConfigResponse;->c:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {v1, v4}, Ll6/b;->q(LG2/q;Ljava/util/List;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object p1, p1, Lcom/anilab/data/model/response/MovieConfigResponse;->d:Ljava/lang/String;

    .line 32
    .line 33
    invoke-direct {v0, v2, v3, v1, p1}, LH2/q;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v0
    .line 37
    .line 38
.end method

.method public final bridge synthetic n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/anilab/data/model/response/MovieConfigResponse;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LG2/r;->a(Lcom/anilab/data/model/response/MovieConfigResponse;)LH2/q;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
