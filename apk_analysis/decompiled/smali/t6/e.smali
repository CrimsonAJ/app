.class public final synthetic Lt6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lt6/f;

.field public final synthetic b:Ljava/util/concurrent/Callable;

.field public final synthetic c:Lcom/google/firebase/messaging/u;


# direct methods
.method public synthetic constructor <init>(Lt6/f;Ljava/util/concurrent/Callable;Lcom/google/firebase/messaging/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/e;->a:Lt6/f;

    iput-object p2, p0, Lt6/e;->b:Ljava/util/concurrent/Callable;

    iput-object p3, p0, Lt6/e;->c:Lcom/google/firebase/messaging/u;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lt6/e;->a:Lt6/f;

    .line 2
    .line 3
    new-instance v1, LA6/r;

    .line 4
    .line 5
    iget-object v2, p0, Lt6/e;->c:Lcom/google/firebase/messaging/u;

    .line 6
    .line 7
    iget-object v3, p0, Lt6/e;->b:Ljava/util/concurrent/Callable;

    .line 8
    .line 9
    const/16 v4, 0x1b

    .line 10
    .line 11
    invoke-direct {v1, v3, v4, v2}, LA6/r;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lt6/f;->a:Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
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
.end method
