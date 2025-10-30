.class public abstract Lco/notix/q8;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/content/Context;LO7/l;Ly0/f;)V
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "$context"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$onResult"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    .line 6
    sget-object v3, Ly0/g;->e:Ly0/g;

    .line 7
    iget-object v4, p2, Ly0/f;->b:Ls/e;

    invoke-virtual {v4, v3}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly0/e;

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-eqz p2, :cond_1

    .line 8
    sget-object v4, Ly0/g;->d:Ly0/g;

    .line 9
    iget-object v5, p2, Ly0/f;->b:Ls/e;

    invoke-virtual {v5, v4}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly0/e;

    goto :goto_1

    :cond_1
    move-object v4, v2

    :goto_1
    if-eqz p2, :cond_2

    .line 10
    sget-object v5, Ly0/g;->f:Ly0/g;

    .line 11
    iget-object p2, p2, Ly0/f;->b:Ls/e;

    invoke-virtual {p2, v5}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly0/e;

    goto :goto_2

    :cond_2
    move-object p2, v2

    :goto_2
    const/4 v5, 0x3

    .line 12
    new-array v5, v5, [Ly0/e;

    aput-object v3, v5, v1

    aput-object v4, v5, v0

    const/4 v3, 0x2

    aput-object p2, v5, v3

    .line 13
    invoke-static {v5}, LB7/j;->k0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p2

    .line 14
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p2, v4}, LB7/m;->f0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v4

    :goto_3
    if-ge v1, v4, :cond_3

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/2addr v1, v0

    check-cast v5, Ly0/e;

    .line 15
    invoke-virtual {v5}, Ly0/e;->a()V

    .line 16
    iget v6, v5, Ly0/e;->h:I

    .line 17
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget v5, v5, Ly0/e;->d:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 18
    new-instance v7, LA7/h;

    invoke-direct {v7, v6, v5}, LA7/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_4

    move-object v2, v3

    :cond_4
    if-nez v2, :cond_5

    .line 20
    sget p2, Lco/notix/R$color;->notix_interstitial_text_color:I

    invoke-virtual {p0, p2}, Landroid/content/Context;->getColor(I)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget v0, Lco/notix/R$color;->notix_interstitial_text_background_color:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getColor(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    .line 21
    new-instance v0, LA7/h;

    invoke-direct {v0, p2, p0}, LA7/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    invoke-static {v0}, LB6/u0;->D(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :cond_5
    invoke-interface {p1, v2}, LO7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static a(Lco/notix/j6;Landroid/graphics/Bitmap;Lco/notix/b6;)V
    .locals 2

    .line 1
    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ld0/n;

    invoke-direct {v0, p1}, Ld0/n;-><init>(Landroid/graphics/Bitmap;)V

    .line 3
    new-instance p1, LN1/h;

    const/4 v1, 0x4

    invoke-direct {p1, p0, v1, p2}, LN1/h;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 4
    new-instance p0, Ly0/d;

    invoke-direct {p0, v0, p1}, Ly0/d;-><init>(Ld0/n;LN1/h;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    iget-object p2, v0, Ld0/n;->d:Ljava/lang/Object;

    check-cast p2, Landroid/graphics/Bitmap;

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    .line 5
    invoke-virtual {p0, p1, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
