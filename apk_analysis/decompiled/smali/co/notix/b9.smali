.class public final Lco/notix/b9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/e;


# instance fields
.field public final synthetic a:Lb8/e;

.field public final synthetic b:Lco/notix/d9;


# direct methods
.method public constructor <init>(Lb8/F;Lco/notix/d9;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/b9;->a:Lb8/e;

    .line 2
    .line 3
    iput-object p2, p0, Lco/notix/b9;->b:Lco/notix/d9;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public final collect(Lb8/f;LE7/d;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lco/notix/b9;->a:Lb8/e;

    .line 2
    .line 3
    new-instance v1, Lco/notix/a9;

    .line 4
    .line 5
    iget-object v2, p0, Lco/notix/b9;->b:Lco/notix/d9;

    .line 6
    .line 7
    invoke-direct {v1, p1, v2}, Lco/notix/a9;-><init>(Lb8/f;Lco/notix/d9;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1, p2}, Lb8/e;->collect(Lb8/f;LE7/d;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object p2, LF7/a;->a:LF7/a;

    .line 15
    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, LA7/n;->a:LA7/n;

    .line 20
    .line 21
    return-object p1
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
