.class public final LK1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/z;


# instance fields
.field public a:Lq2/u;


# virtual methods
.method public final a(Lo8/d;)Li8/L;
    .locals 3

    .line 1
    iget-object v0, p1, Lo8/d;->e:Li8/G;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lo8/d;->b(Li8/G;)Li8/L;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p1, Li8/L;->g:Li8/N;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, LK1/b;

    .line 14
    .line 15
    iget-object v2, p0, LK1/f;->a:Lq2/u;

    .line 16
    .line 17
    invoke-direct {v1, v0, v2}, LK1/b;-><init>(Li8/N;Lq2/u;)V

    .line 18
    .line 19
    .line 20
    move-object v0, v1

    .line 21
    :goto_0
    invoke-virtual {p1}, Li8/L;->s()Li8/K;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p1, Li8/K;->g:Li8/N;

    .line 29
    .line 30
    invoke-virtual {p1}, Li8/K;->a()Li8/L;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
    .line 35
    .line 36
    .line 37
    .line 38
.end method
