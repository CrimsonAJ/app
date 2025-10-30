.class public final LN3/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN3/z;


# instance fields
.field public final a:Lk4/l;

.field public final b:LC3/v;

.field public final c:Lb5/G1;

.field public d:Le1/q;

.field public final e:I


# direct methods
.method public constructor <init>(Lk4/l;Lq3/h;)V
    .locals 3

    .line 1
    new-instance v0, LC3/v;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1, p2}, LC3/v;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p2, Lb5/G1;

    .line 8
    .line 9
    const/16 v1, 0x12

    .line 10
    .line 11
    invoke-direct {p2, v1}, Lb5/G1;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Le1/q;

    .line 15
    .line 16
    const/4 v2, -0x1

    .line 17
    invoke-direct {v1, v2}, Le1/q;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LN3/V;->a:Lk4/l;

    .line 24
    .line 25
    iput-object v0, p0, LN3/V;->b:LC3/v;

    .line 26
    .line 27
    iput-object p2, p0, LN3/V;->c:Lb5/G1;

    .line 28
    .line 29
    iput-object v1, p0, LN3/V;->d:Le1/q;

    .line 30
    .line 31
    const/high16 p1, 0x100000

    .line 32
    .line 33
    iput p1, p0, LN3/V;->e:I

    .line 34
    .line 35
    return-void
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
.method public final a(Le1/q;)LN3/z;
    .locals 1

    .line 1
    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, Ll4/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LN3/V;->d:Le1/q;

    .line 7
    .line 8
    return-object p0
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

.method public final b(Lj3/Y;)LN3/a;
    .locals 8

    .line 1
    iget-object v0, p1, Lj3/Y;->b:Lj3/U;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lj3/Y;->b:Lj3/U;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, LN3/W;

    .line 12
    .line 13
    iget-object v0, p0, LN3/V;->c:Lb5/G1;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lb5/G1;->m(Lj3/Y;)Ln3/o;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object v6, p0, LN3/V;->d:Le1/q;

    .line 20
    .line 21
    iget v7, p0, LN3/V;->e:I

    .line 22
    .line 23
    iget-object v3, p0, LN3/V;->a:Lk4/l;

    .line 24
    .line 25
    iget-object v4, p0, LN3/V;->b:LC3/v;

    .line 26
    .line 27
    move-object v2, p1

    .line 28
    invoke-direct/range {v1 .. v7}, LN3/W;-><init>(Lj3/Y;Lk4/l;LC3/v;Ln3/o;Le1/q;I)V

    .line 29
    .line 30
    .line 31
    return-object v1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
