.class public final Lco/notix/nb;
.super Lco/notix/t8;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/ma;


# direct methods
.method public constructor <init>(Lco/notix/ma;)V
    .locals 1

    const-string v0, "eventRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lco/notix/t8;-><init>()V

    iput-object p1, p0, Lco/notix/nb;->a:Lco/notix/ma;

    return-void
.end method


# virtual methods
.method public final a(Lco/notix/ob;LE7/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lco/notix/mb;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/mb;

    iget v1, v0, Lco/notix/mb;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/mb;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/mb;

    invoke-direct {v0, p0, p2}, Lco/notix/mb;-><init>(Lco/notix/nb;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/mb;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/mb;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/nb;->a:Lco/notix/ma;

    .line 2
    iget-object v2, p1, Lco/notix/ob;->a:Ljava/lang/String;

    .line 3
    iget-object p1, p1, Lco/notix/ob;->b:Lco/notix/d3;

    .line 4
    iput v3, v0, Lco/notix/mb;->c:I

    .line 5
    iget-object v4, p2, Lco/notix/ma;->c:LY7/z;

    .line 6
    invoke-interface {v4}, LY7/z;->g()LE7/i;

    move-result-object v4

    new-instance v5, Lco/notix/la;

    const/4 v6, 0x0

    invoke-direct {v5, p2, v2, p1, v6}, Lco/notix/la;-><init>(Lco/notix/ma;Ljava/lang/String;Lco/notix/d3;LE7/d;)V

    invoke-static {v4, v5, v0}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 7
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-ne p1, v3, :cond_4

    sget-object p1, Lco/notix/v8;->a:Lco/notix/v8;

    return-object p1

    :cond_4
    if-nez p1, :cond_5

    sget-object p1, Lco/notix/v8;->b:Lco/notix/v8;

    return-object p1

    :cond_5
    new-instance p1, LA7/b;

    .line 8
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 9
    throw p1
.end method

.method public final bridge synthetic a(Lco/notix/u8;Lco/notix/mj;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lco/notix/ob;

    invoke-virtual {p0, p1, p2}, Lco/notix/nb;->a(Lco/notix/ob;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
