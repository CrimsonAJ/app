.class public final LN3/A;
.super LN3/y;
.source "SourceFile"


# direct methods
.method public constructor <init>(IJLjava/lang/Object;)V
    .locals 7

    const/4 v2, -0x1

    const/4 v3, -0x1

    move-object v0, p0

    move v6, p1

    move-wide v4, p2

    move-object v1, p4

    .line 2
    invoke-direct/range {v0 .. v6}, LN3/y;-><init>(Ljava/lang/Object;IIJI)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    const-wide/16 v0, -0x1

    .line 1
    invoke-direct {p0, v0, v1, p1}, LN3/y;-><init>(JLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LN3/A;
    .locals 9

    .line 1
    new-instance v0, LN3/A;

    .line 2
    .line 3
    iget-object v1, p0, LN3/y;->a:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v2, p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v2, LN3/y;

    .line 14
    .line 15
    iget v4, p0, LN3/y;->b:I

    .line 16
    .line 17
    iget v5, p0, LN3/y;->c:I

    .line 18
    .line 19
    iget-wide v6, p0, LN3/y;->d:J

    .line 20
    .line 21
    iget v8, p0, LN3/y;->e:I

    .line 22
    .line 23
    move-object v3, p1

    .line 24
    invoke-direct/range {v2 .. v8}, LN3/y;-><init>(Ljava/lang/Object;IIJI)V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-direct {v0, v2}, LN3/y;-><init>(LN3/y;)V

    .line 28
    .line 29
    .line 30
    return-object v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
