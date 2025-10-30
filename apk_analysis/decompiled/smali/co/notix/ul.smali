.class public final Lco/notix/ul;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/md;


# instance fields
.field public final b:Lco/notix/yl;

.field public final c:LY7/z;


# direct methods
.method public constructor <init>(Lco/notix/lm;LY7/z;)V
    .locals 1

    .line 1
    const-string v0, "remoteLoggerRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "csIo"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lco/notix/ul;->b:Lco/notix/yl;

    .line 15
    .line 16
    iput-object p2, p0, Lco/notix/ul;->c:LY7/z;

    .line 17
    .line 18
    sget-object p1, Lco/notix/log/LogLevel;->NONE:Lco/notix/log/LogLevel;

    .line 19
    .line 20
    return-void
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
.method public final a(Ljava/lang/String;)V
    .locals 3

    .line 2
    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/ul;->c:LY7/z;

    new-instance v1, Lco/notix/sl;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lco/notix/sl;-><init>(Ljava/lang/String;Lco/notix/ul;LE7/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v1, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/ul;->c:LY7/z;

    new-instance v1, Lco/notix/rl;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, p0, v2}, Lco/notix/rl;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lco/notix/ul;LE7/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v1, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/ul;->c:LY7/z;

    new-instance v1, Lco/notix/tl;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lco/notix/tl;-><init>(Ljava/lang/String;Lco/notix/ul;LE7/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v1, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method

.method public final setLogLevel(Lco/notix/log/LogLevel;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
