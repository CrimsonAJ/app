.class public interface abstract LB2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;LE7/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime LB8/i;
            value = "X-MAL-CLIENT-ID"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LB8/y;
        .end annotation
    .end param
    .annotation runtime LB8/f;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "LE7/d<",
            "-",
            "Lcom/anilab/data/model/response/MalResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
