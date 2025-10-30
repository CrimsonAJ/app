.class public final Lcom/anilab/data/model/response/MalResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lo7/l;
    generateAdapter = true
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lcom/anilab/data/model/response/MalPagingResponse;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/anilab/data/model/response/MalPagingResponse;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "data"
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/response/MalPagingResponse;
        .annotation runtime Lo7/i;
            name = "paging"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/anilab/data/model/response/MalDataResponse;",
            ">;",
            "Lcom/anilab/data/model/response/MalPagingResponse;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "malData"

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
    iput-object p1, p0, Lcom/anilab/data/model/response/MalResponse;->a:Ljava/util/List;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/anilab/data/model/response/MalResponse;->b:Lcom/anilab/data/model/response/MalPagingResponse;

    .line 12
    .line 13
    return-void
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
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final copy(Ljava/util/List;Lcom/anilab/data/model/response/MalPagingResponse;)Lcom/anilab/data/model/response/MalResponse;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation runtime Lo7/i;
            name = "data"
        .end annotation
    .end param
    .param p2    # Lcom/anilab/data/model/response/MalPagingResponse;
        .annotation runtime Lo7/i;
            name = "paging"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/anilab/data/model/response/MalDataResponse;",
            ">;",
            "Lcom/anilab/data/model/response/MalPagingResponse;",
            ")",
            "Lcom/anilab/data/model/response/MalResponse;"
        }
    .end annotation

    const-string v0, "malData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/anilab/data/model/response/MalResponse;

    invoke-direct {v0, p1, p2}, Lcom/anilab/data/model/response/MalResponse;-><init>(Ljava/util/List;Lcom/anilab/data/model/response/MalPagingResponse;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/anilab/data/model/response/MalResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/anilab/data/model/response/MalResponse;

    iget-object v1, p1, Lcom/anilab/data/model/response/MalResponse;->a:Ljava/util/List;

    iget-object v3, p0, Lcom/anilab/data/model/response/MalResponse;->a:Ljava/util/List;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/anilab/data/model/response/MalResponse;->b:Lcom/anilab/data/model/response/MalPagingResponse;

    iget-object p1, p1, Lcom/anilab/data/model/response/MalResponse;->b:Lcom/anilab/data/model/response/MalPagingResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/anilab/data/model/response/MalResponse;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/anilab/data/model/response/MalResponse;->b:Lcom/anilab/data/model/response/MalPagingResponse;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/anilab/data/model/response/MalPagingResponse;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MalResponse(malData="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/anilab/data/model/response/MalResponse;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paging="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/anilab/data/model/response/MalResponse;->b:Lcom/anilab/data/model/response/MalPagingResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
