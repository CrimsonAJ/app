.class public final Lco/notix/vn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/di;

.field public final b:Lco/notix/er;

.field public final c:Lco/notix/er;

.field public final d:Lco/notix/er;

.field public final e:Lco/notix/er;

.field public final f:Lco/notix/er;


# direct methods
.method public constructor <init>(Lco/notix/di;)V
    .locals 2

    const-string v0, "objectStorageProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/vn;->a:Lco/notix/di;

    new-instance p1, Lco/notix/er;

    new-instance v0, Lco/notix/mn;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lco/notix/mn;-><init>(Lco/notix/vn;LE7/d;)V

    invoke-direct {p1, v0}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object p1, p0, Lco/notix/vn;->b:Lco/notix/er;

    new-instance p1, Lco/notix/er;

    new-instance v0, Lco/notix/xm;

    invoke-direct {v0, p0, v1}, Lco/notix/xm;-><init>(Lco/notix/vn;LE7/d;)V

    invoke-direct {p1, v0}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object p1, p0, Lco/notix/vn;->c:Lco/notix/er;

    new-instance p1, Lco/notix/er;

    new-instance v0, Lco/notix/en;

    invoke-direct {v0, p0, v1}, Lco/notix/en;-><init>(Lco/notix/vn;LE7/d;)V

    invoke-direct {p1, v0}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object p1, p0, Lco/notix/vn;->d:Lco/notix/er;

    new-instance p1, Lco/notix/er;

    new-instance v0, Lco/notix/tn;

    invoke-direct {v0, p0, v1}, Lco/notix/tn;-><init>(Lco/notix/vn;LE7/d;)V

    invoke-direct {p1, v0}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object p1, p0, Lco/notix/vn;->e:Lco/notix/er;

    new-instance p1, Lco/notix/er;

    new-instance v0, Lco/notix/ln;

    invoke-direct {v0, p0, v1}, Lco/notix/ln;-><init>(Lco/notix/vn;LE7/d;)V

    invoke-direct {p1, v0}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object p1, p0, Lco/notix/vn;->f:Lco/notix/er;

    return-void
.end method


# virtual methods
.method public final a(JLE7/d;)Ljava/lang/Object;
    .locals 5

    .line 5
    instance-of v0, p3, Lco/notix/hn;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lco/notix/hn;

    iget v1, v0, Lco/notix/hn;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/hn;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/hn;

    invoke-direct {v0, p0, p3}, Lco/notix/hn;-><init>(Lco/notix/vn;LE7/d;)V

    :goto_0
    iget-object p3, v0, Lco/notix/hn;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/hn;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide p1, v0, Lco/notix/hn;->a:J

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    iget-object p3, p0, Lco/notix/vn;->f:Lco/notix/er;

    iput-wide p1, v0, Lco/notix/hn;->a:J

    iput v4, v0, Lco/notix/hn;->d:I

    invoke-virtual {p3, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p3, Lco/notix/vh;

    new-instance v2, Lco/notix/in;

    invoke-direct {v2, p1, p2}, Lco/notix/in;-><init>(J)V

    iput v3, v0, Lco/notix/hn;->d:I

    invoke-virtual {p3, v2, v0}, Lco/notix/vh;->b(LO7/l;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 3
    instance-of v0, p1, Lco/notix/pm;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/pm;

    iget v1, v0, Lco/notix/pm;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/pm;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/pm;

    invoke-direct {v0, p0, p1}, Lco/notix/pm;-><init>(Lco/notix/vn;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/pm;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/pm;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/vn;->c:Lco/notix/er;

    iput v4, v0, Lco/notix/pm;->c:I

    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lco/notix/vh;

    iput v3, v0, Lco/notix/pm;->c:I

    invoke-virtual {p1, v0}, Lco/notix/vh;->b(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method

.method public final a(Lco/notix/fm;LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 2
    instance-of v0, p2, Lco/notix/om;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/om;

    iget v1, v0, Lco/notix/om;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/om;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/om;

    invoke-direct {v0, p0, p2}, Lco/notix/om;-><init>(Lco/notix/vn;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/om;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/om;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lco/notix/om;->a:LO7/l;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/vn;->d:Lco/notix/er;

    iput-object p1, v0, Lco/notix/om;->a:LO7/l;

    iput v4, v0, Lco/notix/om;->d:I

    invoke-virtual {p2, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lco/notix/vh;

    const/4 v2, 0x0

    iput-object v2, v0, Lco/notix/om;->a:LO7/l;

    iput v3, v0, Lco/notix/om;->d:I

    invoke-virtual {p2, p1, v0}, Lco/notix/vh;->a(LO7/l;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method

.method public final a(Lco/notix/gm;LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 6
    instance-of v0, p2, Lco/notix/un;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/un;

    iget v1, v0, Lco/notix/un;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/un;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/un;

    invoke-direct {v0, p0, p2}, Lco/notix/un;-><init>(Lco/notix/vn;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/un;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/un;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lco/notix/un;->a:LO7/l;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/vn;->e:Lco/notix/er;

    iput-object p1, v0, Lco/notix/un;->a:LO7/l;

    iput v4, v0, Lco/notix/un;->d:I

    invoke-virtual {p2, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lco/notix/vh;

    const/4 v2, 0x0

    iput-object v2, v0, Lco/notix/un;->a:LO7/l;

    iput v3, v0, Lco/notix/un;->d:I

    invoke-virtual {p2, p1, v0}, Lco/notix/vh;->b(LO7/l;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method

.method public final a(Lco/notix/pl;JLE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p4, Lco/notix/mm;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lco/notix/mm;

    iget v1, v0, Lco/notix/mm;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/mm;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/mm;

    invoke-direct {v0, p0, p4}, Lco/notix/mm;-><init>(Lco/notix/vn;LE7/d;)V

    :goto_0
    iget-object p4, v0, Lco/notix/mm;->c:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/mm;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide p2, v0, Lco/notix/mm;->b:J

    iget-object p1, v0, Lco/notix/mm;->a:Lco/notix/pl;

    invoke-static {p4}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, La/a;->A(Ljava/lang/Object;)V

    iget-object p4, p0, Lco/notix/vn;->c:Lco/notix/er;

    iput-object p1, v0, Lco/notix/mm;->a:Lco/notix/pl;

    iput-wide p2, v0, Lco/notix/mm;->b:J

    iput v4, v0, Lco/notix/mm;->e:I

    invoke-virtual {p4, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p4, Lco/notix/vh;

    new-instance v2, Lco/notix/nm;

    invoke-direct {v2, p1, p2, p3}, Lco/notix/nm;-><init>(Lco/notix/pl;J)V

    const/4 p1, 0x0

    iput-object p1, v0, Lco/notix/mm;->a:Lco/notix/pl;

    iput v3, v0, Lco/notix/mm;->e:I

    invoke-virtual {p4, v2, v0}, Lco/notix/vh;->b(LO7/l;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final a(Ljava/util/Set;LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 4
    instance-of v0, p2, Lco/notix/fn;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/fn;

    iget v1, v0, Lco/notix/fn;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/fn;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/fn;

    invoke-direct {v0, p0, p2}, Lco/notix/fn;-><init>(Lco/notix/vn;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/fn;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/fn;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lco/notix/fn;->a:Ljava/util/Set;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/vn;->c:Lco/notix/er;

    iput-object p1, v0, Lco/notix/fn;->a:Ljava/util/Set;

    iput v4, v0, Lco/notix/fn;->d:I

    invoke-virtual {p2, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lco/notix/vh;

    new-instance v2, Lco/notix/gn;

    invoke-direct {v2, p1}, Lco/notix/gn;-><init>(Ljava/util/Set;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lco/notix/fn;->a:Ljava/util/Set;

    iput v3, v0, Lco/notix/fn;->d:I

    invoke-virtual {p2, v2, v0}, Lco/notix/vh;->b(LO7/l;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final b(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lco/notix/qm;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lco/notix/qm;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/qm;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lco/notix/qm;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/qm;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lco/notix/qm;-><init>(Lco/notix/vn;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lco/notix/qm;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/qm;->c:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lco/notix/vn;->f:Lco/notix/er;

    .line 59
    .line 60
    iput v4, v0, Lco/notix/qm;->c:I

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    :goto_1
    check-cast p1, Lco/notix/vh;

    .line 70
    .line 71
    iput v3, v0, Lco/notix/qm;->c:I

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lco/notix/vh;->b(LE7/d;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v1, :cond_5

    .line 78
    .line 79
    :goto_2
    return-object v1

    .line 80
    :cond_5
    return-object p1
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
