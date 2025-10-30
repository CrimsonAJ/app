.class public final Lco/notix/appopen/NotixAppOpen$Companion;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/appopen/NotixAppOpen;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/notix/appopen/NotixAppOpen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lco/notix/appopen/NotixAppOpen$Companion;


# instance fields
.field private final synthetic $$delegate_0:Lco/notix/appopen/NotixAppOpen;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/notix/appopen/NotixAppOpen$Companion;

    invoke-direct {v0}, Lco/notix/appopen/NotixAppOpen$Companion;-><init>()V

    sput-object v0, Lco/notix/appopen/NotixAppOpen$Companion;->$$INSTANCE:Lco/notix/appopen/NotixAppOpen$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lco/notix/wq;->q()Lco/notix/rf;

    move-result-object v0

    iput-object v0, p0, Lco/notix/appopen/NotixAppOpen$Companion;->$$delegate_0:Lco/notix/appopen/NotixAppOpen;

    return-void
.end method


# virtual methods
.method public createLoader(J)Lco/notix/appopen/AppOpenLoader;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    iget-object v0, p0, Lco/notix/appopen/NotixAppOpen$Companion;->$$delegate_0:Lco/notix/appopen/NotixAppOpen;

    invoke-interface {v0, p1, p2}, Lco/notix/appopen/NotixAppOpen;->createLoader(J)Lco/notix/appopen/AppOpenLoader;

    move-result-object p1

    return-object p1
.end method

.method public createLoader(JLco/notix/domain/RequestVars;)Lco/notix/appopen/AppOpenLoader;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 2
    iget-object v0, p0, Lco/notix/appopen/NotixAppOpen$Companion;->$$delegate_0:Lco/notix/appopen/NotixAppOpen;

    invoke-interface {v0, p1, p2, p3}, Lco/notix/appopen/NotixAppOpen;->createLoader(JLco/notix/domain/RequestVars;)Lco/notix/appopen/AppOpenLoader;

    move-result-object p1

    return-object p1
.end method

.method public createLoader(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/appopen/AppOpenLoader;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 3
    iget-object v0, p0, Lco/notix/appopen/NotixAppOpen$Companion;->$$delegate_0:Lco/notix/appopen/NotixAppOpen;

    invoke-interface {v0, p1, p2, p3, p4}, Lco/notix/appopen/NotixAppOpen;->createLoader(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/appopen/AppOpenLoader;

    move-result-object p1

    return-object p1
.end method

.method public createLoader(JLjava/lang/Integer;)Lco/notix/appopen/AppOpenLoader;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 4
    iget-object v0, p0, Lco/notix/appopen/NotixAppOpen$Companion;->$$delegate_0:Lco/notix/appopen/NotixAppOpen;

    invoke-interface {v0, p1, p2, p3}, Lco/notix/appopen/NotixAppOpen;->createLoader(JLjava/lang/Integer;)Lco/notix/appopen/AppOpenLoader;

    move-result-object p1

    return-object p1
.end method

.method public doOnApplicationOpen(LO7/l;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO7/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/appopen/NotixAppOpen$Companion;->$$delegate_0:Lco/notix/appopen/NotixAppOpen;

    invoke-interface {v0, p1}, Lco/notix/appopen/NotixAppOpen;->doOnApplicationOpen(LO7/l;)V

    return-void
.end method

.method public doOnApplicationOpen(LO7/l;J)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO7/l;",
            "J)V"
        }
    .end annotation

    .line 2
    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/appopen/NotixAppOpen$Companion;->$$delegate_0:Lco/notix/appopen/NotixAppOpen;

    invoke-interface {v0, p1, p2, p3}, Lco/notix/appopen/NotixAppOpen;->doOnApplicationOpen(LO7/l;J)V

    return-void
.end method

.method public ignoreNextApplicationOpen()V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lco/notix/appopen/NotixAppOpen$Companion;->$$delegate_0:Lco/notix/appopen/NotixAppOpen;

    invoke-interface {v0}, Lco/notix/appopen/NotixAppOpen;->ignoreNextApplicationOpen()V

    return-void
.end method

.method public show(Lco/notix/appopen/AppOpenData;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    const-string v0, "appOpenData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/appopen/NotixAppOpen$Companion;->$$delegate_0:Lco/notix/appopen/NotixAppOpen;

    invoke-interface {v0, p1}, Lco/notix/appopen/NotixAppOpen;->show(Lco/notix/appopen/AppOpenData;)V

    return-void
.end method

.method public show(Lco/notix/appopen/AppOpenData;LO7/a;LO7/a;LO7/l;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/notix/appopen/AppOpenData;",
            "LO7/a;",
            "LO7/a;",
            "LO7/l;",
            ")V"
        }
    .end annotation

    .line 2
    const-string v0, "appOpenData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/appopen/NotixAppOpen$Companion;->$$delegate_0:Lco/notix/appopen/NotixAppOpen;

    invoke-interface {v0, p1, p2, p3, p4}, Lco/notix/appopen/NotixAppOpen;->show(Lco/notix/appopen/AppOpenData;LO7/a;LO7/a;LO7/l;)V

    return-void
.end method

.method public startAutoShow(Lco/notix/appopen/AppOpenLoader;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    const-string v0, "appOpenLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/appopen/NotixAppOpen$Companion;->$$delegate_0:Lco/notix/appopen/NotixAppOpen;

    invoke-interface {v0, p1}, Lco/notix/appopen/NotixAppOpen;->startAutoShow(Lco/notix/appopen/AppOpenLoader;)V

    return-void
.end method

.method public startAutoShow(Lco/notix/appopen/AppOpenLoader;JJLO7/a;LO7/a;LO7/l;)V
    .locals 10
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/notix/appopen/AppOpenLoader;",
            "JJ",
            "LO7/a;",
            "LO7/a;",
            "LO7/l;",
            ")V"
        }
    .end annotation

    .line 2
    const-string v0, "appOpenLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/notix/appopen/NotixAppOpen$Companion;->$$delegate_0:Lco/notix/appopen/NotixAppOpen;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-interface/range {v1 .. v9}, Lco/notix/appopen/NotixAppOpen;->startAutoShow(Lco/notix/appopen/AppOpenLoader;JJLO7/a;LO7/a;LO7/l;)V

    return-void
.end method

.method public stopAutoShow()V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lco/notix/appopen/NotixAppOpen$Companion;->$$delegate_0:Lco/notix/appopen/NotixAppOpen;

    invoke-interface {v0}, Lco/notix/appopen/NotixAppOpen;->stopAutoShow()V

    return-void
.end method
